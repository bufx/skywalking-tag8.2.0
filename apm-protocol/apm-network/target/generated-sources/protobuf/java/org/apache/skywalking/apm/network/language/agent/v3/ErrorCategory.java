// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/BrowserPerf.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * Protobuf enum {@code ErrorCategory}
 */
public enum ErrorCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ajax = 0;</code>
   */
  ajax(0),
  /**
   * <code>resource = 1;</code>
   */
  resource(1),
  /**
   * <code>vue = 2;</code>
   */
  vue(2),
  /**
   * <code>promise = 3;</code>
   */
  promise(3),
  /**
   * <code>js = 4;</code>
   */
  js(4),
  /**
   * <code>unknown = 5;</code>
   */
  unknown(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ajax = 0;</code>
   */
  public static final int ajax_VALUE = 0;
  /**
   * <code>resource = 1;</code>
   */
  public static final int resource_VALUE = 1;
  /**
   * <code>vue = 2;</code>
   */
  public static final int vue_VALUE = 2;
  /**
   * <code>promise = 3;</code>
   */
  public static final int promise_VALUE = 3;
  /**
   * <code>js = 4;</code>
   */
  public static final int js_VALUE = 4;
  /**
   * <code>unknown = 5;</code>
   */
  public static final int unknown_VALUE = 5;


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
  public static ErrorCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrorCategory forNumber(int value) {
    switch (value) {
      case 0: return ajax;
      case 1: return resource;
      case 2: return vue;
      case 3: return promise;
      case 4: return js;
      case 5: return unknown;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorCategory>() {
          public ErrorCategory findValueByNumber(int number) {
            return ErrorCategory.forNumber(number);
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
    return org.apache.skywalking.apm.network.language.agent.v3.BrowserPerf.getDescriptor().getEnumTypes().get(0);
  }

  private static final ErrorCategory[] VALUES = values();

  public static ErrorCategory valueOf(
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

  private ErrorCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ErrorCategory)
}

