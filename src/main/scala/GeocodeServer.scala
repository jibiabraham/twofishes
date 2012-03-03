//  Copyright 2012 Foursquare Labs Inc. All Rights Reserved
package com.foursquare.geocoder

import collection.JavaConversions._
import com.twitter.finagle.builder.{ServerBuilder, Server}
import com.twitter.finagle.http.Http
import com.twitter.finagle.thrift.ThriftServerFramedCodec
import com.twitter.finagle.Service
import com.twitter.util.Future
import java.net.InetSocketAddress
import org.apache.thrift.protocol.{TBinaryProtocol, TSimpleJSONProtocol}
import org.apache.thrift.TSerializer
import org.jboss.netty.buffer.ChannelBuffers
import org.jboss.netty.handler.codec.http._
import org.jboss.netty.util.CharsetUtil

class GeocodeServerImpl extends Geocoder.ServiceIface  {
  def geocode(r: GeocodeRequest): Future[GeocodeResponse] = {
    println("Handling request")
    val response = new GeocodeResponse()
    Future.value(response)
  }
}

class GeocoderHttpService extends Service[HttpRequest, HttpResponse] {
  def apply(request: HttpRequest) = {
    val response = new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK)
    // This is how you parse request parameters
    val params = new QueryStringDecoder(request.getUri()).getParameters()
    val responseContent = params.toString()

    println(params)
    println(params("query"))
    println(params("query")(0))
    // This is how you write to response
    val geocode = new GeocoderImpl(new MongoGeocodeStorageService()).geocode(
      new GeocodeRequest(params("query")(0)))

    val serializer = new TSerializer(new TSimpleJSONProtocol.Factory());
    val json = serializer.toString(geocode);

    response.setContent(ChannelBuffers.copiedBuffer(json, CharsetUtil.UTF_8))
    Future.value(response)
  }
}

object GeocodeServer {
  def main(args: Array[String]) {
    // Implement the Thrift Interface
    val processor = new GeocodeServerImpl()

    // Convert the Thrift Processor to a Finagle Service
    val service = new Geocoder.Service(processor, new TBinaryProtocol.Factory())

    val server: Server = ServerBuilder()
      .bindTo(new InetSocketAddress(8080))
      .codec(ThriftServerFramedCodec())
      .name("geocoder")
      .build(service)

    val server2: Server = ServerBuilder()
      .bindTo(new InetSocketAddress(8081))
      .codec(Http())
      .name("geocoder-http")
      .build(new GeocoderHttpService())
  }
}


