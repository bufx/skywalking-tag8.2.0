// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

/**
 * <pre>
 * Wrapper for a set of headers.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.HeaderMap}
 */
public final class HeaderMap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.HeaderMap)
    HeaderMapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeaderMap.newBuilder() to construct.
  private HeaderMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeaderMap() {
    headers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeaderMap();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeaderMap(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              headers_ = new java.util.ArrayList<io.envoyproxy.envoy.api.v2.core.HeaderValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            headers_.add(
                input.readMessage(io.envoyproxy.envoy.api.v2.core.HeaderValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        headers_ = java.util.Collections.unmodifiableList(headers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderMap_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderMap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.api.v2.core.HeaderMap.class, io.envoyproxy.envoy.api.v2.core.HeaderMap.Builder.class);
  }

  public static final int HEADERS_FIELD_NUMBER = 1;
  private java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue> headers_;
  /**
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue> getHeadersList() {
    return headers_;
  }
  /**
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> 
      getHeadersOrBuilderList() {
    return headers_;
  }
  /**
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
   */
  @java.lang.Override
  public int getHeadersCount() {
    return headers_.size();
  }
  /**
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.HeaderValue getHeaders(int index) {
    return headers_.get(index);
  }
  /**
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder getHeadersOrBuilder(
      int index) {
    return headers_.get(index);
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
    for (int i = 0; i < headers_.size(); i++) {
      output.writeMessage(1, headers_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < headers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, headers_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.api.v2.core.HeaderMap)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.api.v2.core.HeaderMap other = (io.envoyproxy.envoy.api.v2.core.HeaderMap) obj;

    if (!getHeadersList()
        .equals(other.getHeadersList())) return false;
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
    if (getHeadersCount() > 0) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeadersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.api.v2.core.HeaderMap parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.api.v2.core.HeaderMap prototype) {
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
   * Wrapper for a set of headers.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.HeaderMap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.HeaderMap)
      io.envoyproxy.envoy.api.v2.core.HeaderMapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderMap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.api.v2.core.HeaderMap.class, io.envoyproxy.envoy.api.v2.core.HeaderMap.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.api.v2.core.HeaderMap.newBuilder()
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
        getHeadersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headersBuilder_ == null) {
        headers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        headersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.api.v2.core.BaseProto.internal_static_envoy_api_v2_core_HeaderMap_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.HeaderMap getDefaultInstanceForType() {
      return io.envoyproxy.envoy.api.v2.core.HeaderMap.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.HeaderMap build() {
      io.envoyproxy.envoy.api.v2.core.HeaderMap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.api.v2.core.HeaderMap buildPartial() {
      io.envoyproxy.envoy.api.v2.core.HeaderMap result = new io.envoyproxy.envoy.api.v2.core.HeaderMap(this);
      int from_bitField0_ = bitField0_;
      if (headersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          headers_ = java.util.Collections.unmodifiableList(headers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.headers_ = headers_;
      } else {
        result.headers_ = headersBuilder_.build();
      }
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
      if (other instanceof io.envoyproxy.envoy.api.v2.core.HeaderMap) {
        return mergeFrom((io.envoyproxy.envoy.api.v2.core.HeaderMap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.api.v2.core.HeaderMap other) {
      if (other == io.envoyproxy.envoy.api.v2.core.HeaderMap.getDefaultInstance()) return this;
      if (headersBuilder_ == null) {
        if (!other.headers_.isEmpty()) {
          if (headers_.isEmpty()) {
            headers_ = other.headers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHeadersIsMutable();
            headers_.addAll(other.headers_);
          }
          onChanged();
        }
      } else {
        if (!other.headers_.isEmpty()) {
          if (headersBuilder_.isEmpty()) {
            headersBuilder_.dispose();
            headersBuilder_ = null;
            headers_ = other.headers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            headersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHeadersFieldBuilder() : null;
          } else {
            headersBuilder_.addAllMessages(other.headers_);
          }
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
      io.envoyproxy.envoy.api.v2.core.HeaderMap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.api.v2.core.HeaderMap) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue> headers_ =
      java.util.Collections.emptyList();
    private void ensureHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        headers_ = new java.util.ArrayList<io.envoyproxy.envoy.api.v2.core.HeaderValue>(headers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.HeaderValue, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder, io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> headersBuilder_;

    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue> getHeadersList() {
      if (headersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(headers_);
      } else {
        return headersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public int getHeadersCount() {
      if (headersBuilder_ == null) {
        return headers_.size();
      } else {
        return headersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValue getHeaders(int index) {
      if (headersBuilder_ == null) {
        return headers_.get(index);
      } else {
        return headersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder setHeaders(
        int index, io.envoyproxy.envoy.api.v2.core.HeaderValue value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.set(index, value);
        onChanged();
      } else {
        headersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder setHeaders(
        int index, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.set(index, builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder addHeaders(io.envoyproxy.envoy.api.v2.core.HeaderValue value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.add(value);
        onChanged();
      } else {
        headersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder addHeaders(
        int index, io.envoyproxy.envoy.api.v2.core.HeaderValue value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.add(index, value);
        onChanged();
      } else {
        headersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder addHeaders(
        io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.add(builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder addHeaders(
        int index, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.add(index, builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder addAllHeaders(
        java.lang.Iterable<? extends io.envoyproxy.envoy.api.v2.core.HeaderValue> values) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, headers_);
        onChanged();
      } else {
        headersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder clearHeaders() {
      if (headersBuilder_ == null) {
        headers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        headersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public Builder removeHeaders(int index) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.remove(index);
        onChanged();
      } else {
        headersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder getHeadersBuilder(
        int index) {
      return getHeadersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder getHeadersOrBuilder(
        int index) {
      if (headersBuilder_ == null) {
        return headers_.get(index);  } else {
        return headersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> 
         getHeadersOrBuilderList() {
      if (headersBuilder_ != null) {
        return headersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(headers_);
      }
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder addHeadersBuilder() {
      return getHeadersFieldBuilder().addBuilder(
          io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder addHeadersBuilder(
        int index) {
      return getHeadersFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.api.v2.core.HeaderValue.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.api.v2.core.HeaderValue headers = 1;</code>
     */
    public java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder> 
         getHeadersBuilderList() {
      return getHeadersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.api.v2.core.HeaderValue, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder, io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> 
        getHeadersFieldBuilder() {
      if (headersBuilder_ == null) {
        headersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.api.v2.core.HeaderValue, io.envoyproxy.envoy.api.v2.core.HeaderValue.Builder, io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder>(
                headers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        headers_ = null;
      }
      return headersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.HeaderMap)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.HeaderMap)
  private static final io.envoyproxy.envoy.api.v2.core.HeaderMap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.api.v2.core.HeaderMap();
  }

  public static io.envoyproxy.envoy.api.v2.core.HeaderMap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeaderMap>
      PARSER = new com.google.protobuf.AbstractParser<HeaderMap>() {
    @java.lang.Override
    public HeaderMap parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeaderMap(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeaderMap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeaderMap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.api.v2.core.HeaderMap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

