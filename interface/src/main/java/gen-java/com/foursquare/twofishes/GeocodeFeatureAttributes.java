/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.twofishes;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class GeocodeFeatureAttributes implements TBase<GeocodeFeatureAttributes, GeocodeFeatureAttributes._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GeocodeFeatureAttributes");

  private static final TField ADM0CAP_FIELD_DESC = new TField("adm0cap", TType.BOOL, (short)1);
  private static final TField ADM1CAP_FIELD_DESC = new TField("adm1cap", TType.BOOL, (short)2);
  private static final TField SCALERANK_FIELD_DESC = new TField("scalerank", TType.I32, (short)3);
  private static final TField LABELRANK_FIELD_DESC = new TField("labelrank", TType.I32, (short)4);
  private static final TField NATSCALE_FIELD_DESC = new TField("natscale", TType.I32, (short)5);
  private static final TField POPULATION_FIELD_DESC = new TField("population", TType.I32, (short)6);

  public boolean adm0cap;
  public boolean adm1cap;
  public int scalerank;
  public int labelrank;
  public int natscale;
  public int population;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ADM0CAP((short)1, "adm0cap"),
    ADM1CAP((short)2, "adm1cap"),
    SCALERANK((short)3, "scalerank"),
    LABELRANK((short)4, "labelrank"),
    NATSCALE((short)5, "natscale"),
    POPULATION((short)6, "population");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ADM0CAP
          return ADM0CAP;
        case 2: // ADM1CAP
          return ADM1CAP;
        case 3: // SCALERANK
          return SCALERANK;
        case 4: // LABELRANK
          return LABELRANK;
        case 5: // NATSCALE
          return NATSCALE;
        case 6: // POPULATION
          return POPULATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ADM0CAP_ISSET_ID = 0;
  private static final int __ADM1CAP_ISSET_ID = 1;
  private static final int __SCALERANK_ISSET_ID = 2;
  private static final int __LABELRANK_ISSET_ID = 3;
  private static final int __NATSCALE_ISSET_ID = 4;
  private static final int __POPULATION_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADM0CAP, new FieldMetaData("adm0cap", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.ADM1CAP, new FieldMetaData("adm1cap", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.SCALERANK, new FieldMetaData("scalerank", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.LABELRANK, new FieldMetaData("labelrank", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.NATSCALE, new FieldMetaData("natscale", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.POPULATION, new FieldMetaData("population", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(GeocodeFeatureAttributes.class, metaDataMap);
  }

  public GeocodeFeatureAttributes() {
    this.adm0cap = false;

    this.adm1cap = false;

    this.scalerank = 0;

    this.labelrank = 0;

    this.natscale = 0;

    this.population = 0;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GeocodeFeatureAttributes(GeocodeFeatureAttributes other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.adm0cap = other.adm0cap;
    this.adm1cap = other.adm1cap;
    this.scalerank = other.scalerank;
    this.labelrank = other.labelrank;
    this.natscale = other.natscale;
    this.population = other.population;
  }

  public GeocodeFeatureAttributes deepCopy() {
    return new GeocodeFeatureAttributes(this);
  }

  @Override
  public void clear() {
    this.adm0cap = false;

    this.adm1cap = false;

    this.scalerank = 0;

    this.labelrank = 0;

    this.natscale = 0;

    this.population = 0;

  }

  public boolean isAdm0cap() {
    return this.adm0cap;
  }

  public GeocodeFeatureAttributes setAdm0cap(boolean adm0cap) {
    this.adm0cap = adm0cap;
    setAdm0capIsSet(true);
    return this;
  }

  public void unsetAdm0cap() {
    __isset_bit_vector.clear(__ADM0CAP_ISSET_ID);
  }

  /** Returns true if field adm0cap is set (has been asigned a value) and false otherwise */
  public boolean isSetAdm0cap() {
    return __isset_bit_vector.get(__ADM0CAP_ISSET_ID);
  }

  public void setAdm0capIsSet(boolean value) {
    __isset_bit_vector.set(__ADM0CAP_ISSET_ID, value);
  }

  public boolean isAdm1cap() {
    return this.adm1cap;
  }

  public GeocodeFeatureAttributes setAdm1cap(boolean adm1cap) {
    this.adm1cap = adm1cap;
    setAdm1capIsSet(true);
    return this;
  }

  public void unsetAdm1cap() {
    __isset_bit_vector.clear(__ADM1CAP_ISSET_ID);
  }

  /** Returns true if field adm1cap is set (has been asigned a value) and false otherwise */
  public boolean isSetAdm1cap() {
    return __isset_bit_vector.get(__ADM1CAP_ISSET_ID);
  }

  public void setAdm1capIsSet(boolean value) {
    __isset_bit_vector.set(__ADM1CAP_ISSET_ID, value);
  }

  public int getScalerank() {
    return this.scalerank;
  }

  public GeocodeFeatureAttributes setScalerank(int scalerank) {
    this.scalerank = scalerank;
    setScalerankIsSet(true);
    return this;
  }

  public void unsetScalerank() {
    __isset_bit_vector.clear(__SCALERANK_ISSET_ID);
  }

  /** Returns true if field scalerank is set (has been asigned a value) and false otherwise */
  public boolean isSetScalerank() {
    return __isset_bit_vector.get(__SCALERANK_ISSET_ID);
  }

  public void setScalerankIsSet(boolean value) {
    __isset_bit_vector.set(__SCALERANK_ISSET_ID, value);
  }

  public int getLabelrank() {
    return this.labelrank;
  }

  public GeocodeFeatureAttributes setLabelrank(int labelrank) {
    this.labelrank = labelrank;
    setLabelrankIsSet(true);
    return this;
  }

  public void unsetLabelrank() {
    __isset_bit_vector.clear(__LABELRANK_ISSET_ID);
  }

  /** Returns true if field labelrank is set (has been asigned a value) and false otherwise */
  public boolean isSetLabelrank() {
    return __isset_bit_vector.get(__LABELRANK_ISSET_ID);
  }

  public void setLabelrankIsSet(boolean value) {
    __isset_bit_vector.set(__LABELRANK_ISSET_ID, value);
  }

  public int getNatscale() {
    return this.natscale;
  }

  public GeocodeFeatureAttributes setNatscale(int natscale) {
    this.natscale = natscale;
    setNatscaleIsSet(true);
    return this;
  }

  public void unsetNatscale() {
    __isset_bit_vector.clear(__NATSCALE_ISSET_ID);
  }

  /** Returns true if field natscale is set (has been asigned a value) and false otherwise */
  public boolean isSetNatscale() {
    return __isset_bit_vector.get(__NATSCALE_ISSET_ID);
  }

  public void setNatscaleIsSet(boolean value) {
    __isset_bit_vector.set(__NATSCALE_ISSET_ID, value);
  }

  public int getPopulation() {
    return this.population;
  }

  public GeocodeFeatureAttributes setPopulation(int population) {
    this.population = population;
    setPopulationIsSet(true);
    return this;
  }

  public void unsetPopulation() {
    __isset_bit_vector.clear(__POPULATION_ISSET_ID);
  }

  /** Returns true if field population is set (has been asigned a value) and false otherwise */
  public boolean isSetPopulation() {
    return __isset_bit_vector.get(__POPULATION_ISSET_ID);
  }

  public void setPopulationIsSet(boolean value) {
    __isset_bit_vector.set(__POPULATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADM0CAP:
      if (value == null) {
        unsetAdm0cap();
      } else {
        setAdm0cap((Boolean)value);
      }
      break;

    case ADM1CAP:
      if (value == null) {
        unsetAdm1cap();
      } else {
        setAdm1cap((Boolean)value);
      }
      break;

    case SCALERANK:
      if (value == null) {
        unsetScalerank();
      } else {
        setScalerank((Integer)value);
      }
      break;

    case LABELRANK:
      if (value == null) {
        unsetLabelrank();
      } else {
        setLabelrank((Integer)value);
      }
      break;

    case NATSCALE:
      if (value == null) {
        unsetNatscale();
      } else {
        setNatscale((Integer)value);
      }
      break;

    case POPULATION:
      if (value == null) {
        unsetPopulation();
      } else {
        setPopulation((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADM0CAP:
      return new Boolean(isAdm0cap());

    case ADM1CAP:
      return new Boolean(isAdm1cap());

    case SCALERANK:
      return new Integer(getScalerank());

    case LABELRANK:
      return new Integer(getLabelrank());

    case NATSCALE:
      return new Integer(getNatscale());

    case POPULATION:
      return new Integer(getPopulation());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADM0CAP:
      return isSetAdm0cap();
    case ADM1CAP:
      return isSetAdm1cap();
    case SCALERANK:
      return isSetScalerank();
    case LABELRANK:
      return isSetLabelrank();
    case NATSCALE:
      return isSetNatscale();
    case POPULATION:
      return isSetPopulation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GeocodeFeatureAttributes)
      return this.equals((GeocodeFeatureAttributes)that);
    return false;
  }

  public boolean equals(GeocodeFeatureAttributes that) {
    if (that == null)
      return false;

    boolean this_present_adm0cap = true && this.isSetAdm0cap();
    boolean that_present_adm0cap = true && that.isSetAdm0cap();
    if (this_present_adm0cap || that_present_adm0cap) {
      if (!(this_present_adm0cap && that_present_adm0cap))
        return false;
      if (this.adm0cap != that.adm0cap)
        return false;
    }

    boolean this_present_adm1cap = true && this.isSetAdm1cap();
    boolean that_present_adm1cap = true && that.isSetAdm1cap();
    if (this_present_adm1cap || that_present_adm1cap) {
      if (!(this_present_adm1cap && that_present_adm1cap))
        return false;
      if (this.adm1cap != that.adm1cap)
        return false;
    }

    boolean this_present_scalerank = true && this.isSetScalerank();
    boolean that_present_scalerank = true && that.isSetScalerank();
    if (this_present_scalerank || that_present_scalerank) {
      if (!(this_present_scalerank && that_present_scalerank))
        return false;
      if (this.scalerank != that.scalerank)
        return false;
    }

    boolean this_present_labelrank = true && this.isSetLabelrank();
    boolean that_present_labelrank = true && that.isSetLabelrank();
    if (this_present_labelrank || that_present_labelrank) {
      if (!(this_present_labelrank && that_present_labelrank))
        return false;
      if (this.labelrank != that.labelrank)
        return false;
    }

    boolean this_present_natscale = true && this.isSetNatscale();
    boolean that_present_natscale = true && that.isSetNatscale();
    if (this_present_natscale || that_present_natscale) {
      if (!(this_present_natscale && that_present_natscale))
        return false;
      if (this.natscale != that.natscale)
        return false;
    }

    boolean this_present_population = true && this.isSetPopulation();
    boolean that_present_population = true && that.isSetPopulation();
    if (this_present_population || that_present_population) {
      if (!(this_present_population && that_present_population))
        return false;
      if (this.population != that.population)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GeocodeFeatureAttributes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GeocodeFeatureAttributes typedOther = (GeocodeFeatureAttributes)other;

    lastComparison = Boolean.valueOf(isSetAdm0cap()).compareTo(typedOther.isSetAdm0cap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdm0cap()) {
      lastComparison = TBaseHelper.compareTo(this.adm0cap, typedOther.adm0cap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdm1cap()).compareTo(typedOther.isSetAdm1cap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdm1cap()) {
      lastComparison = TBaseHelper.compareTo(this.adm1cap, typedOther.adm1cap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScalerank()).compareTo(typedOther.isSetScalerank());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScalerank()) {
      lastComparison = TBaseHelper.compareTo(this.scalerank, typedOther.scalerank);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLabelrank()).compareTo(typedOther.isSetLabelrank());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabelrank()) {
      lastComparison = TBaseHelper.compareTo(this.labelrank, typedOther.labelrank);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNatscale()).compareTo(typedOther.isSetNatscale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNatscale()) {
      lastComparison = TBaseHelper.compareTo(this.natscale, typedOther.natscale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPopulation()).compareTo(typedOther.isSetPopulation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPopulation()) {
      lastComparison = TBaseHelper.compareTo(this.population, typedOther.population);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ADM0CAP
          if (field.type == TType.BOOL) {
            this.adm0cap = iprot.readBool();
            setAdm0capIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ADM1CAP
          if (field.type == TType.BOOL) {
            this.adm1cap = iprot.readBool();
            setAdm1capIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SCALERANK
          if (field.type == TType.I32) {
            this.scalerank = iprot.readI32();
            setScalerankIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LABELRANK
          if (field.type == TType.I32) {
            this.labelrank = iprot.readI32();
            setLabelrankIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // NATSCALE
          if (field.type == TType.I32) {
            this.natscale = iprot.readI32();
            setNatscaleIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // POPULATION
          if (field.type == TType.I32) {
            this.population = iprot.readI32();
            setPopulationIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (isSetAdm0cap()) {
      oprot.writeFieldBegin(ADM0CAP_FIELD_DESC);
      oprot.writeBool(this.adm0cap);
      oprot.writeFieldEnd();
    }
    if (isSetAdm1cap()) {
      oprot.writeFieldBegin(ADM1CAP_FIELD_DESC);
      oprot.writeBool(this.adm1cap);
      oprot.writeFieldEnd();
    }
    if (isSetScalerank()) {
      oprot.writeFieldBegin(SCALERANK_FIELD_DESC);
      oprot.writeI32(this.scalerank);
      oprot.writeFieldEnd();
    }
    if (isSetLabelrank()) {
      oprot.writeFieldBegin(LABELRANK_FIELD_DESC);
      oprot.writeI32(this.labelrank);
      oprot.writeFieldEnd();
    }
    if (isSetNatscale()) {
      oprot.writeFieldBegin(NATSCALE_FIELD_DESC);
      oprot.writeI32(this.natscale);
      oprot.writeFieldEnd();
    }
    if (isSetPopulation()) {
      oprot.writeFieldBegin(POPULATION_FIELD_DESC);
      oprot.writeI32(this.population);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GeocodeFeatureAttributes(");
    boolean first = true;

    if (isSetAdm0cap()) {
      sb.append("adm0cap:");
      sb.append(this.adm0cap);
      first = false;
    }
    if (isSetAdm1cap()) {
      if (!first) sb.append(", ");
      sb.append("adm1cap:");
      sb.append(this.adm1cap);
      first = false;
    }
    if (isSetScalerank()) {
      if (!first) sb.append(", ");
      sb.append("scalerank:");
      sb.append(this.scalerank);
      first = false;
    }
    if (isSetLabelrank()) {
      if (!first) sb.append(", ");
      sb.append("labelrank:");
      sb.append(this.labelrank);
      first = false;
    }
    if (isSetNatscale()) {
      if (!first) sb.append(", ");
      sb.append("natscale:");
      sb.append(this.natscale);
      first = false;
    }
    if (isSetPopulation()) {
      if (!first) sb.append(", ");
      sb.append("population:");
      sb.append(this.population);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

