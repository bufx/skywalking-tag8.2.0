// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mixer/adapter/model/v1beta1/extensions.proto

package io.istio.api.mixer.adapter.model.v1beta1;

public final class ExtensionsProto {
  private ExtensionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(io.istio.api.mixer.adapter.model.v1beta1.ExtensionsProto.templateVariety);
    registry.add(io.istio.api.mixer.adapter.model.v1beta1.ExtensionsProto.templateName);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * The available varieties of templates, controlling the semantics of what an adapter does with each instance.
   * </pre>
   *
   * Protobuf enum {@code istio.mixer.adapter.model.v1beta1.TemplateVariety}
   */
  public enum TemplateVariety
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Makes the template applicable for Mixer's check calls. Instances of such template are created during
     * report calls in Mixer and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_CHECK = 0;</code>
     */
    TEMPLATE_VARIETY_CHECK(0),
    /**
     * <pre>
     * Makes the template applicable for Mixer's report calls. Instances of such template are created during
     * check calls in Mixer and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_REPORT = 1;</code>
     */
    TEMPLATE_VARIETY_REPORT(1),
    /**
     * <pre>
     * Makes the template applicable for Mixer's quota calls. Instances of such template are created during
     * quota check calls in Mixer and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_QUOTA = 2;</code>
     */
    TEMPLATE_VARIETY_QUOTA(2),
    /**
     * <pre>
     * Makes the template applicable for Mixer's attribute generation phase. Instances of such template are created during
     * pre-processing attribute generation phase and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_ATTRIBUTE_GENERATOR = 3;</code>
     */
    TEMPLATE_VARIETY_ATTRIBUTE_GENERATOR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Makes the template applicable for Mixer's check calls. Instances of such template are created during
     * report calls in Mixer and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_CHECK = 0;</code>
     */
    public static final int TEMPLATE_VARIETY_CHECK_VALUE = 0;
    /**
     * <pre>
     * Makes the template applicable for Mixer's report calls. Instances of such template are created during
     * check calls in Mixer and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_REPORT = 1;</code>
     */
    public static final int TEMPLATE_VARIETY_REPORT_VALUE = 1;
    /**
     * <pre>
     * Makes the template applicable for Mixer's quota calls. Instances of such template are created during
     * quota check calls in Mixer and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_QUOTA = 2;</code>
     */
    public static final int TEMPLATE_VARIETY_QUOTA_VALUE = 2;
    /**
     * <pre>
     * Makes the template applicable for Mixer's attribute generation phase. Instances of such template are created during
     * pre-processing attribute generation phase and passed to the handlers based on the rule configurations.
     * </pre>
     *
     * <code>TEMPLATE_VARIETY_ATTRIBUTE_GENERATOR = 3;</code>
     */
    public static final int TEMPLATE_VARIETY_ATTRIBUTE_GENERATOR_VALUE = 3;


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
    public static TemplateVariety valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TemplateVariety forNumber(int value) {
      switch (value) {
        case 0: return TEMPLATE_VARIETY_CHECK;
        case 1: return TEMPLATE_VARIETY_REPORT;
        case 2: return TEMPLATE_VARIETY_QUOTA;
        case 3: return TEMPLATE_VARIETY_ATTRIBUTE_GENERATOR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TemplateVariety>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TemplateVariety> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TemplateVariety>() {
            public TemplateVariety findValueByNumber(int number) {
              return TemplateVariety.forNumber(number);
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
      return io.istio.api.mixer.adapter.model.v1beta1.ExtensionsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final TemplateVariety[] VALUES = values();

    public static TemplateVariety valueOf(
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

    private TemplateVariety(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:istio.mixer.adapter.model.v1beta1.TemplateVariety)
  }

  public static final int TEMPLATE_VARIETY_FIELD_NUMBER = 72295727;
  /**
   * <pre>
   * Required: option for the TemplateVariety.
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      io.istio.api.mixer.adapter.model.v1beta1.ExtensionsProto.TemplateVariety> templateVariety = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        io.istio.api.mixer.adapter.model.v1beta1.ExtensionsProto.TemplateVariety.class,
        null);
  public static final int TEMPLATE_NAME_FIELD_NUMBER = 72295888;
  /**
   * <pre>
   * Optional: option for the template name.
   * If not specified, the last segment of the template proto's package name is used to
   * derive the template name.
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.String> templateName = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,mixer/adapter/model/v1beta1/extensions" +
      ".proto\022!istio.mixer.adapter.model.v1beta" +
      "1\032 google/protobuf/descriptor.proto*\220\001\n\017" +
      "TemplateVariety\022\032\n\026TEMPLATE_VARIETY_CHEC" +
      "K\020\000\022\033\n\027TEMPLATE_VARIETY_REPORT\020\001\022\032\n\026TEMP" +
      "LATE_VARIETY_QUOTA\020\002\022(\n$TEMPLATE_VARIETY" +
      "_ATTRIBUTE_GENERATOR\020\003:m\n\020template_varie" +
      "ty\022\034.google.protobuf.FileOptions\030\257\312\274\" \001(" +
      "\01622.istio.mixer.adapter.model.v1beta1.Te" +
      "mplateVariety:6\n\rtemplate_name\022\034.google." +
      "protobuf.FileOptions\030\320\313\274\" \001(\tBe\n(io.isti" +
      "o.api.mixer.adapter.model.v1beta1B\017Exten" +
      "sionsProtoZ(istio.io/api/mixer/adapter/m" +
      "odel/v1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    templateVariety.internalInit(descriptor.getExtensions().get(0));
    templateName.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
