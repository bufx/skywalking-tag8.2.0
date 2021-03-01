// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

public interface RuntimeFractionalPercentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.core.RuntimeFractionalPercent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   * @return The defaultValue.
   */
  io.envoyproxy.envoy.type.FractionalPercent getDefaultValue();
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.type.FractionalPercentOrBuilder getDefaultValueOrBuilder();

  /**
   * <pre>
   * Runtime key for a YAML representation of a FractionalPercent.
   * </pre>
   *
   * <code>string runtime_key = 2;</code>
   * @return The runtimeKey.
   */
  java.lang.String getRuntimeKey();
  /**
   * <pre>
   * Runtime key for a YAML representation of a FractionalPercent.
   * </pre>
   *
   * <code>string runtime_key = 2;</code>
   * @return The bytes for runtimeKey.
   */
  com.google.protobuf.ByteString
      getRuntimeKeyBytes();
}
