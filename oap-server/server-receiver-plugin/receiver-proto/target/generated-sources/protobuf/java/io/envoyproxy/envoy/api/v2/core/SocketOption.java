// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

/**
 * <pre>
 * Generic socket option message. This would be used to set socket options that
 * might not exist in upstream kernels or precompiled Envoy binaries.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.SocketOption}
 */
public final class SocketOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.SocketOption)
    SocketOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocketOption.newBuilder() to construct.
  private SocketOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocketOption() {
    description_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SocketOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocketOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 16: {

            level_ = input.readInt64();
            break;
          }
          case 24: {

            name_ = input.readInt64();
            break;
          }
          case 32: {
            valueCase_ = 4;
            value_ = input.readInt64();
            break;
          }
          case 42: {
            valueCase_ = 5;
            value_ = input.readBytes();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_SocketOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_SocketOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.api.v2.core.SocketOption.class, io.envoyproxy.envoy.api.v2.core.SocketOption.Builder.class);
  }

  /**
   * Protobuf enum {@code envoy.api.v2.core.SocketOption.SocketState}
   */
  public enum SocketState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Socket options are applied after socket creation but before binding the socket to a port
     * </pre>
     *
     * <code>STATE_PREBIND = 0;</code>
     */
    STATE_PREBIND(0),
    /**
     * <pre>
     * Socket options are applied after binding the socket to a port but before calling listen()
     * </pre>
     *
     * <code>STATE_BOUND = 1;</code>
     */
    STATE_BOUND(1),
    /**
     * <pre>
     * Socket options are applied after calling listen()
     * </pre>
     *
     * <code>STATE_LISTENING = 2;</code>
     */
    STATE_LISTENING(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Socket options are applied after socket creation but before binding the socket to a port
     * </pre>
     *
     * <code>STATE_PREBIND = 0;</code>
     */
    public static final int STATE_PREBIND_VALUE = 0;
    /**
     * <pre>
     * Socket options are applied after binding the socket to a port but before calling listen()
     * </pre>
     *
     * <code>STATE_BOUND = 1;</code>
     */
    public static final int STATE_BOUND_VALUE = 1;
    /**
     * <pre>
     * Socket options are applied after calling listen()
     * </pre>
     *
     * <code>STATE_LISTENING = 2;</code>
     */
    public static final int STATE_LISTENING_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SocketState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SocketState forNumber(int value) {
      switch (value) {
        case 0: return STATE_PREBIND;
        case 1: return STATE_BOUND;
        case 2: return STATE_LISTENING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SocketState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SocketState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SocketState>() {
            public SocketState findValueByNumber(int number) {
              return SocketState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.core.SocketOption.getDescriptor().getEnumTypes().get(0);
    }

    private static final SocketState[] VALUES = values();

    public static SocketState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SocketState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.api.v2.core.SocketOption.SocketState)
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INT_VALUE(4),
    BUF_VALUE(5),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 4: return INT_VALUE;
        case 5: return BUF_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * An optional name to give this socket option for debugging, etc.
   * Uniqueness is not required and no special meaning is assumed.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional name to give this socket option for debugging, etc.
   * Uniqueness is not required and no special meaning is assumed.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 2;
  private long level_;
  /**
   * <pre>
   * Corresponding to the level value passed to setsockopt, such as IPPROTO_TCP
   * </pre>
   *
   * <code>int64 level = 2;</code>
   * @return The level.
   */
  @java.lang.Override
  public long getLevel() {
    return level_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private long name_;
  /**
   * <pre>
   * The numeric name as passed to setsockopt
   * </pre>
   *
   * <code>int64 name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public long getName() {
    return name_;
  }

  public static final int INT_VALUE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Because many sockopts take an int value.
   * </pre>
   *
   * <code>int64 int_value = 4;</code>
   * @return The intValue.
   */
  @java.lang.Override
  public long getIntValue() {
    if (valueCase_ == 4) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int BUF_VALUE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Otherwise it's a byte buffer.
   * </pre>
   *
   * <code>bytes buf_value = 5;</code>
   * @return The bufValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBufValue() {
    if (valueCase_ == 5) {
      return (com.google.protobuf.ByteString) value_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int STATE_FIELD_NUMBER = 6;
  private int state_;
  /**
   * <pre>
   * The state in which the option will be applied. When used in BindConfig
   * STATE_PREBIND is currently the only valid value.
   * </pre>
   *
   * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * The state in which the option will be applied. When used in BindConfig
   * STATE_PREBIND is currently the only valid value.
   * </pre>
   *
   * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
   * @return The state.
   */
  @java.lang.Override public io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState getState() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState result = io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState.valueOf(state_);
    return result == null ? io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (level_ != 0L) {
      output.writeInt64(2, level_);
    }
    if (name_ != 0L) {
      output.writeInt64(3, name_);
    }
    if (valueCase_ == 4) {
      output.writeInt64(
          4, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 5) {
      output.writeBytes(
          5, (com.google.protobuf.ByteString) value_);
    }
    if (state_ != io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState.STATE_PREBIND.getNumber()) {
      output.writeEnum(6, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (level_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, level_);
    }
    if (name_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, name_);
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            4, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            5, (com.google.protobuf.ByteString) value_);
    }
    if (state_ != io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState.STATE_PREBIND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.envoyproxy.envoy.api.v2.core.SocketOption)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.api.v2.core.SocketOption other = (io.envoyproxy.envoy.api.v2.core.SocketOption) obj;

    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getName()
        != other.getName()) return false;
    if (state_ != other.state_) return false;
    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 4:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 5:
        if (!getBufValue()
            .equals(other.getBufValue())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLevel());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getName());
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    switch (valueCase_) {
      case 4:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIntValue());
        break;
      case 5:
        hash = (37 * hash) + BUF_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getBufValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.SocketOption parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.envoyproxy.envoy.api.v2.core.SocketOption prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Generic socket option message. This would be used to set socket options that
   * might not exist in upstream kernels or precompiled Envoy binaries.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.SocketOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.SocketOption)
      io.envoyproxy.envoy.api.v2.core.SocketOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_SocketOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_SocketOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.api.v2.core.SocketOption.class, io.envoyproxy.envoy.api.v2.core.SocketOption.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.api.v2.core.SocketOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      description_ = "";

      level_ = 0L;

      name_ = 0L;

      state_ = 0;

      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_SocketOption_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.SocketOption getDefaultInstanceForType() {
      return io.envoyproxy.envoy.api.v2.core.SocketOption.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.SocketOption build() {
      io.envoyproxy.envoy.api.v2.core.SocketOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.SocketOption buildPartial() {
      io.envoyproxy.envoy.api.v2.core.SocketOption result = new io.envoyproxy.envoy.api.v2.core.SocketOption(this);
      result.description_ = description_;
      result.level_ = level_;
      result.name_ = name_;
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      if (valueCase_ == 5) {
        result.value_ = value_;
      }
      result.state_ = state_;
      result.valueCase_ = valueCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.envoyproxy.envoy.api.v2.core.SocketOption) {
        return mergeFrom((io.envoyproxy.envoy.api.v2.core.SocketOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.api.v2.core.SocketOption other) {
      if (other == io.envoyproxy.envoy.api.v2.core.SocketOption.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getLevel() != 0L) {
        setLevel(other.getLevel());
      }
      if (other.getName() != 0L) {
        setName(other.getName());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      switch (other.getValueCase()) {
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case BUF_VALUE: {
          setBufValue(other.getBufValue());
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.envoyproxy.envoy.api.v2.core.SocketOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.api.v2.core.SocketOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object description_ = "";
    /**
     * <pre>
     * An optional name to give this socket option for debugging, etc.
     * Uniqueness is not required and no special meaning is assumed.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional name to give this socket option for debugging, etc.
     * Uniqueness is not required and no special meaning is assumed.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional name to give this socket option for debugging, etc.
     * Uniqueness is not required and no special meaning is assumed.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional name to give this socket option for debugging, etc.
     * Uniqueness is not required and no special meaning is assumed.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional name to give this socket option for debugging, etc.
     * Uniqueness is not required and no special meaning is assumed.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private long level_ ;
    /**
     * <pre>
     * Corresponding to the level value passed to setsockopt, such as IPPROTO_TCP
     * </pre>
     *
     * <code>int64 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public long getLevel() {
      return level_;
    }
    /**
     * <pre>
     * Corresponding to the level value passed to setsockopt, such as IPPROTO_TCP
     * </pre>
     *
     * <code>int64 level = 2;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(long value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Corresponding to the level value passed to setsockopt, such as IPPROTO_TCP
     * </pre>
     *
     * <code>int64 level = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0L;
      onChanged();
      return this;
    }

    private long name_ ;
    /**
     * <pre>
     * The numeric name as passed to setsockopt
     * </pre>
     *
     * <code>int64 name = 3;</code>
     * @return The name.
     */
    @java.lang.Override
    public long getName() {
      return name_;
    }
    /**
     * <pre>
     * The numeric name as passed to setsockopt
     * </pre>
     *
     * <code>int64 name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(long value) {
      
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The numeric name as passed to setsockopt
     * </pre>
     *
     * <code>int64 name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Because many sockopts take an int value.
     * </pre>
     *
     * <code>int64 int_value = 4;</code>
     * @return The intValue.
     */
    public long getIntValue() {
      if (valueCase_ == 4) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Because many sockopts take an int value.
     * </pre>
     *
     * <code>int64 int_value = 4;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(long value) {
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Because many sockopts take an int value.
     * </pre>
     *
     * <code>int64 int_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Otherwise it's a byte buffer.
     * </pre>
     *
     * <code>bytes buf_value = 5;</code>
     * @return The bufValue.
     */
    public com.google.protobuf.ByteString getBufValue() {
      if (valueCase_ == 5) {
        return (com.google.protobuf.ByteString) value_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Otherwise it's a byte buffer.
     * </pre>
     *
     * <code>bytes buf_value = 5;</code>
     * @param value The bufValue to set.
     * @return This builder for chaining.
     */
    public Builder setBufValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Otherwise it's a byte buffer.
     * </pre>
     *
     * <code>bytes buf_value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBufValue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * The state in which the option will be applied. When used in BindConfig
     * STATE_PREBIND is currently the only valid value.
     * </pre>
     *
     * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * The state in which the option will be applied. When used in BindConfig
     * STATE_PREBIND is currently the only valid value.
     * </pre>
     *
     * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state in which the option will be applied. When used in BindConfig
     * STATE_PREBIND is currently the only valid value.
     * </pre>
     *
     * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
     * @return The state.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState getState() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState result = io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState.valueOf(state_);
      return result == null ? io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The state in which the option will be applied. When used in BindConfig
     * STATE_PREBIND is currently the only valid value.
     * </pre>
     *
     * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(io.envoyproxy.envoy.api.v2.core.SocketOption.SocketState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state in which the option will be applied. When used in BindConfig
     * STATE_PREBIND is currently the only valid value.
     * </pre>
     *
     * <code>.envoy.api.v2.core.SocketOption.SocketState state = 6 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.SocketOption)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.SocketOption)
  private static final io.envoyproxy.envoy.api.v2.core.SocketOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.api.v2.core.SocketOption();
  }

  public static io.envoyproxy.envoy.api.v2.core.SocketOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocketOption>
      PARSER = new com.google.protobuf.AbstractParser<SocketOption>() {
    @java.lang.Override
    public SocketOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocketOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocketOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SocketOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.SocketOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

