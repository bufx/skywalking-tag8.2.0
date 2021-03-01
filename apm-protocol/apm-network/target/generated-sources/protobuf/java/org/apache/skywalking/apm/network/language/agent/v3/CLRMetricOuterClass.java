// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public final class CLRMetricOuterClass {
  private CLRMetricOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CLRMetricCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CLRMetricCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CLRMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CLRMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClrGC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClrGC_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClrThread_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClrThread_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036language-agent/CLRMetric.proto\032\023common" +
      "/Common.proto\"\\\n\023CLRMetricCollection\022\033\n\007" +
      "metrics\030\001 \003(\0132\n.CLRMetric\022\017\n\007service\030\002 \001" +
      "(\t\022\027\n\017serviceInstance\030\003 \001(\t\"\\\n\tCLRMetric" +
      "\022\014\n\004time\030\001 \001(\003\022\021\n\003cpu\030\002 \001(\0132\004.CPU\022\022\n\002gc\030" +
      "\003 \001(\0132\006.ClrGC\022\032\n\006thread\030\004 \001(\0132\n.ClrThrea" +
      "d\"i\n\005ClrGC\022\030\n\020Gen0CollectCount\030\001 \001(\003\022\030\n\020" +
      "Gen1CollectCount\030\002 \001(\003\022\030\n\020Gen2CollectCou" +
      "nt\030\003 \001(\003\022\022\n\nHeapMemory\030\004 \001(\003\"\217\001\n\tClrThre" +
      "ad\022&\n\036AvailableCompletionPortThreads\030\001 \001" +
      "(\005\022\036\n\026AvailableWorkerThreads\030\002 \001(\005\022 \n\030Ma" +
      "xCompletionPortThreads\030\003 \001(\005\022\030\n\020MaxWorke" +
      "rThreads\030\004 \001(\0052F\n\026CLRMetricReportService" +
      "\022,\n\007collect\022\024.CLRMetricCollection\032\t.Comm" +
      "ands\"\000B}\n3org.apache.skywalking.apm.netw" +
      "ork.language.agent.v3P\001Z$skywalking/netw" +
      "ork/language/agent/v3\252\002\035SkyWalking.Netwo" +
      "rkProtocol.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_CLRMetricCollection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CLRMetricCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CLRMetricCollection_descriptor,
        new java.lang.String[] { "Metrics", "Service", "ServiceInstance", });
    internal_static_CLRMetric_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CLRMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CLRMetric_descriptor,
        new java.lang.String[] { "Time", "Cpu", "Gc", "Thread", });
    internal_static_ClrGC_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ClrGC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClrGC_descriptor,
        new java.lang.String[] { "Gen0CollectCount", "Gen1CollectCount", "Gen2CollectCount", "HeapMemory", });
    internal_static_ClrThread_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ClrThread_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClrThread_descriptor,
        new java.lang.String[] { "AvailableCompletionPortThreads", "AvailableWorkerThreads", "MaxCompletionPortThreads", "MaxWorkerThreads", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
