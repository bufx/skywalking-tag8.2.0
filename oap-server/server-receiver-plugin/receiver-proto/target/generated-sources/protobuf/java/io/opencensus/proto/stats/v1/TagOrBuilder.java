// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/stats/v1/stats.proto

package io.opencensus.proto.stats.v1;

public interface TagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencensus.proto.stats.v1.Tag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
