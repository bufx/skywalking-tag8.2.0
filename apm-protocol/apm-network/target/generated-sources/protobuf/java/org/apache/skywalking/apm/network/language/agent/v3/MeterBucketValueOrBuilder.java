// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/Meter.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface MeterBucketValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MeterBucketValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The value represents the min value of the bucket,
   * the  upper boundary is determined by next MeterBucketValue$bucket,
   * if it doesn't exist, the upper boundary is positive infinity.
   * Also, could use Int32.MIN_VALUE to represent negative infinity.
   * </pre>
   *
   * <code>double bucket = 1;</code>
   * @return The bucket.
   */
  double getBucket();

  /**
   * <code>int64 count = 2;</code>
   * @return The count.
   */
  long getCount();
}