// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metric-exporter.proto

package org.apache.skywalking.oap.server.exporter.grpc;

public interface SubscriptionsRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SubscriptionsResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string metricNames = 1;</code>
   * @return A list containing the metricNames.
   */
  java.util.List<java.lang.String>
      getMetricNamesList();
  /**
   * <code>repeated string metricNames = 1;</code>
   * @return The count of metricNames.
   */
  int getMetricNamesCount();
  /**
   * <code>repeated string metricNames = 1;</code>
   * @param index The index of the element to return.
   * @return The metricNames at the given index.
   */
  java.lang.String getMetricNames(int index);
  /**
   * <code>repeated string metricNames = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the metricNames at the given index.
   */
  com.google.protobuf.ByteString
      getMetricNamesBytes(int index);
}
