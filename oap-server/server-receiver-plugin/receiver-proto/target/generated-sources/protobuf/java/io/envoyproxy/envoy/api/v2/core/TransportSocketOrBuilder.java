// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

public interface TransportSocketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.core.TransportSocket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the transport socket to instantiate. The name must match a supported transport
   * socket implementation.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the transport socket to instantiate. The name must match a supported transport
   * socket implementation.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Struct config = 2;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <code>.google.protobuf.Struct config = 2;</code>
   * @return The config.
   */
  com.google.protobuf.Struct getConfig();
  /**
   * <code>.google.protobuf.Struct config = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getConfigOrBuilder();

  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();

  public io.envoyproxy.envoy.api.v2.core.TransportSocket.ConfigTypeCase getConfigTypeCase();
}
