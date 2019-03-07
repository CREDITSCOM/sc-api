/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-07")
public class ExecuteByteCodeResult implements org.apache.thrift.TBase<ExecuteByteCodeResult, ExecuteByteCodeResult._Fields>, java.io.Serializable, Cloneable, Comparable<ExecuteByteCodeResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExecuteByteCodeResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INVOKED_CONTRACT_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("invokedContractState", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXTERNAL_CONTRACTS_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("externalContractsState", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField RET_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("ret_val", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExecuteByteCodeResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExecuteByteCodeResultTupleSchemeFactory();

  public com.credits.general.thrift.generated.APIResponse status; // required
  public java.nio.ByteBuffer invokedContractState; // required
  public java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> externalContractsState; // required
  public com.credits.general.thrift.generated.Variant ret_val; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    INVOKED_CONTRACT_STATE((short)2, "invokedContractState"),
    EXTERNAL_CONTRACTS_STATE((short)3, "externalContractsState"),
    RET_VAL((short)4, "ret_val");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // INVOKED_CONTRACT_STATE
          return INVOKED_CONTRACT_STATE;
        case 3: // EXTERNAL_CONTRACTS_STATE
          return EXTERNAL_CONTRACTS_STATE;
        case 4: // RET_VAL
          return RET_VAL;
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
  private static final _Fields optionals[] = {_Fields.RET_VAL};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.INVOKED_CONTRACT_STATE, new org.apache.thrift.meta_data.FieldMetaData("invokedContractState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.EXTERNAL_CONTRACTS_STATE, new org.apache.thrift.meta_data.FieldMetaData("externalContractsState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Address"), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.RET_VAL, new org.apache.thrift.meta_data.FieldMetaData("ret_val", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecuteByteCodeResult.class, metaDataMap);
  }

  public ExecuteByteCodeResult() {
  }

  public ExecuteByteCodeResult(
    com.credits.general.thrift.generated.APIResponse status,
    java.nio.ByteBuffer invokedContractState,
    java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> externalContractsState)
  {
    this();
    this.status = status;
    this.invokedContractState = org.apache.thrift.TBaseHelper.copyBinary(invokedContractState);
    this.externalContractsState = externalContractsState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecuteByteCodeResult(ExecuteByteCodeResult other) {
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    if (other.isSetInvokedContractState()) {
      this.invokedContractState = org.apache.thrift.TBaseHelper.copyBinary(other.invokedContractState);
    }
    if (other.isSetExternalContractsState()) {
      java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> __this__externalContractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(other.externalContractsState.size());
      for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> other_element : other.externalContractsState.entrySet()) {

        java.nio.ByteBuffer other_element_key = other_element.getKey();
        java.nio.ByteBuffer other_element_value = other_element.getValue();

        java.nio.ByteBuffer __this__externalContractsState_copy_key = org.apache.thrift.TBaseHelper.copyBinary(other_element_key);

        java.nio.ByteBuffer __this__externalContractsState_copy_value = org.apache.thrift.TBaseHelper.copyBinary(other_element_value);

        __this__externalContractsState.put(__this__externalContractsState_copy_key, __this__externalContractsState_copy_value);
      }
      this.externalContractsState = __this__externalContractsState;
    }
    if (other.isSetRet_val()) {
      this.ret_val = new com.credits.general.thrift.generated.Variant(other.ret_val);
    }
  }

  public ExecuteByteCodeResult deepCopy() {
    return new ExecuteByteCodeResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.invokedContractState = null;
    this.externalContractsState = null;
    this.ret_val = null;
  }

  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public ExecuteByteCodeResult setStatus(com.credits.general.thrift.generated.APIResponse status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public byte[] getInvokedContractState() {
    setInvokedContractState(org.apache.thrift.TBaseHelper.rightSize(invokedContractState));
    return invokedContractState == null ? null : invokedContractState.array();
  }

  public java.nio.ByteBuffer bufferForInvokedContractState() {
    return org.apache.thrift.TBaseHelper.copyBinary(invokedContractState);
  }

  public ExecuteByteCodeResult setInvokedContractState(byte[] invokedContractState) {
    this.invokedContractState = invokedContractState == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(invokedContractState.clone());
    return this;
  }

  public ExecuteByteCodeResult setInvokedContractState(java.nio.ByteBuffer invokedContractState) {
    this.invokedContractState = org.apache.thrift.TBaseHelper.copyBinary(invokedContractState);
    return this;
  }

  public void unsetInvokedContractState() {
    this.invokedContractState = null;
  }

  /** Returns true if field invokedContractState is set (has been assigned a value) and false otherwise */
  public boolean isSetInvokedContractState() {
    return this.invokedContractState != null;
  }

  public void setInvokedContractStateIsSet(boolean value) {
    if (!value) {
      this.invokedContractState = null;
    }
  }

  public int getExternalContractsStateSize() {
    return (this.externalContractsState == null) ? 0 : this.externalContractsState.size();
  }

  public void putToExternalContractsState(java.nio.ByteBuffer key, java.nio.ByteBuffer val) {
    if (this.externalContractsState == null) {
      this.externalContractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>();
    }
    this.externalContractsState.put(key, val);
  }

  public java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> getExternalContractsState() {
    return this.externalContractsState;
  }

  public ExecuteByteCodeResult setExternalContractsState(java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> externalContractsState) {
    this.externalContractsState = externalContractsState;
    return this;
  }

  public void unsetExternalContractsState() {
    this.externalContractsState = null;
  }

  /** Returns true if field externalContractsState is set (has been assigned a value) and false otherwise */
  public boolean isSetExternalContractsState() {
    return this.externalContractsState != null;
  }

  public void setExternalContractsStateIsSet(boolean value) {
    if (!value) {
      this.externalContractsState = null;
    }
  }

  public com.credits.general.thrift.generated.Variant getRet_val() {
    return this.ret_val;
  }

  public ExecuteByteCodeResult setRet_val(com.credits.general.thrift.generated.Variant ret_val) {
    this.ret_val = ret_val;
    return this;
  }

  public void unsetRet_val() {
    this.ret_val = null;
  }

  /** Returns true if field ret_val is set (has been assigned a value) and false otherwise */
  public boolean isSetRet_val() {
    return this.ret_val != null;
  }

  public void setRet_valIsSet(boolean value) {
    if (!value) {
      this.ret_val = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.credits.general.thrift.generated.APIResponse)value);
      }
      break;

    case INVOKED_CONTRACT_STATE:
      if (value == null) {
        unsetInvokedContractState();
      } else {
        if (value instanceof byte[]) {
          setInvokedContractState((byte[])value);
        } else {
          setInvokedContractState((java.nio.ByteBuffer)value);
        }
      }
      break;

    case EXTERNAL_CONTRACTS_STATE:
      if (value == null) {
        unsetExternalContractsState();
      } else {
        setExternalContractsState((java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer>)value);
      }
      break;

    case RET_VAL:
      if (value == null) {
        unsetRet_val();
      } else {
        setRet_val((com.credits.general.thrift.generated.Variant)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case INVOKED_CONTRACT_STATE:
      return getInvokedContractState();

    case EXTERNAL_CONTRACTS_STATE:
      return getExternalContractsState();

    case RET_VAL:
      return getRet_val();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case INVOKED_CONTRACT_STATE:
      return isSetInvokedContractState();
    case EXTERNAL_CONTRACTS_STATE:
      return isSetExternalContractsState();
    case RET_VAL:
      return isSetRet_val();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecuteByteCodeResult)
      return this.equals((ExecuteByteCodeResult)that);
    return false;
  }

  public boolean equals(ExecuteByteCodeResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_invokedContractState = true && this.isSetInvokedContractState();
    boolean that_present_invokedContractState = true && that.isSetInvokedContractState();
    if (this_present_invokedContractState || that_present_invokedContractState) {
      if (!(this_present_invokedContractState && that_present_invokedContractState))
        return false;
      if (!this.invokedContractState.equals(that.invokedContractState))
        return false;
    }

    boolean this_present_externalContractsState = true && this.isSetExternalContractsState();
    boolean that_present_externalContractsState = true && that.isSetExternalContractsState();
    if (this_present_externalContractsState || that_present_externalContractsState) {
      if (!(this_present_externalContractsState && that_present_externalContractsState))
        return false;
      if (!this.externalContractsState.equals(that.externalContractsState))
        return false;
    }

    boolean this_present_ret_val = true && this.isSetRet_val();
    boolean that_present_ret_val = true && that.isSetRet_val();
    if (this_present_ret_val || that_present_ret_val) {
      if (!(this_present_ret_val && that_present_ret_val))
        return false;
      if (!this.ret_val.equals(that.ret_val))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetInvokedContractState()) ? 131071 : 524287);
    if (isSetInvokedContractState())
      hashCode = hashCode * 8191 + invokedContractState.hashCode();

    hashCode = hashCode * 8191 + ((isSetExternalContractsState()) ? 131071 : 524287);
    if (isSetExternalContractsState())
      hashCode = hashCode * 8191 + externalContractsState.hashCode();

    hashCode = hashCode * 8191 + ((isSetRet_val()) ? 131071 : 524287);
    if (isSetRet_val())
      hashCode = hashCode * 8191 + ret_val.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExecuteByteCodeResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvokedContractState()).compareTo(other.isSetInvokedContractState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvokedContractState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invokedContractState, other.invokedContractState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExternalContractsState()).compareTo(other.isSetExternalContractsState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternalContractsState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.externalContractsState, other.externalContractsState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRet_val()).compareTo(other.isSetRet_val());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRet_val()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ret_val, other.ret_val);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExecuteByteCodeResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invokedContractState:");
    if (this.invokedContractState == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.invokedContractState, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("externalContractsState:");
    if (this.externalContractsState == null) {
      sb.append("null");
    } else {
      sb.append(this.externalContractsState);
    }
    first = false;
    if (isSetRet_val()) {
      if (!first) sb.append(", ");
      sb.append("ret_val:");
      if (this.ret_val == null) {
        sb.append("null");
      } else {
        sb.append(this.ret_val);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExecuteByteCodeResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExecuteByteCodeResultStandardScheme getScheme() {
      return new ExecuteByteCodeResultStandardScheme();
    }
  }

  private static class ExecuteByteCodeResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExecuteByteCodeResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExecuteByteCodeResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.credits.general.thrift.generated.APIResponse();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INVOKED_CONTRACT_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.invokedContractState = iprot.readBinary();
              struct.setInvokedContractStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXTERNAL_CONTRACTS_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.externalContractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(2*_map0.size);
                java.nio.ByteBuffer _key1;
                java.nio.ByteBuffer _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readBinary();
                  _val2 = iprot.readBinary();
                  struct.externalContractsState.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setExternalContractsStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RET_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ret_val = new com.credits.general.thrift.generated.Variant();
              struct.ret_val.read(iprot);
              struct.setRet_valIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExecuteByteCodeResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.invokedContractState != null) {
        oprot.writeFieldBegin(INVOKED_CONTRACT_STATE_FIELD_DESC);
        oprot.writeBinary(struct.invokedContractState);
        oprot.writeFieldEnd();
      }
      if (struct.externalContractsState != null) {
        oprot.writeFieldBegin(EXTERNAL_CONTRACTS_STATE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.externalContractsState.size()));
          for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> _iter4 : struct.externalContractsState.entrySet())
          {
            oprot.writeBinary(_iter4.getKey());
            oprot.writeBinary(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ret_val != null) {
        if (struct.isSetRet_val()) {
          oprot.writeFieldBegin(RET_VAL_FIELD_DESC);
          struct.ret_val.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExecuteByteCodeResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExecuteByteCodeResultTupleScheme getScheme() {
      return new ExecuteByteCodeResultTupleScheme();
    }
  }

  private static class ExecuteByteCodeResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExecuteByteCodeResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExecuteByteCodeResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetInvokedContractState()) {
        optionals.set(1);
      }
      if (struct.isSetExternalContractsState()) {
        optionals.set(2);
      }
      if (struct.isSetRet_val()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetInvokedContractState()) {
        oprot.writeBinary(struct.invokedContractState);
      }
      if (struct.isSetExternalContractsState()) {
        {
          oprot.writeI32(struct.externalContractsState.size());
          for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> _iter5 : struct.externalContractsState.entrySet())
          {
            oprot.writeBinary(_iter5.getKey());
            oprot.writeBinary(_iter5.getValue());
          }
        }
      }
      if (struct.isSetRet_val()) {
        struct.ret_val.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExecuteByteCodeResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.invokedContractState = iprot.readBinary();
        struct.setInvokedContractStateIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.externalContractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(2*_map6.size);
          java.nio.ByteBuffer _key7;
          java.nio.ByteBuffer _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readBinary();
            _val8 = iprot.readBinary();
            struct.externalContractsState.put(_key7, _val8);
          }
        }
        struct.setExternalContractsStateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ret_val = new com.credits.general.thrift.generated.Variant();
        struct.ret_val.read(iprot);
        struct.setRet_valIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

