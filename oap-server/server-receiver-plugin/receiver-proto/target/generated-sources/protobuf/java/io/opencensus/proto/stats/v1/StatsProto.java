// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/stats/v1/stats.proto

package io.opencensus.proto.stats.v1;

public final class StatsProto {
  private StatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_Tag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_Measure_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_Measure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_View_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_View_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_CountAggregation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_CountAggregation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_SumAggregation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_SumAggregation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_LastValueAggregation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_LastValueAggregation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_DistributionAggregation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_DistributionAggregation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_stats_v1_Measurement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_stats_v1_Measurement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%opencensus/proto/stats/v1/stats.proto\022" +
      "\031opencensus.proto.stats.v1\032\037google/proto" +
      "buf/timestamp.proto\"!\n\003Tag\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t\"\246\001\n\007Measure\022\014\n\004name\030\001 \001(\t" +
      "\022\023\n\013description\030\002 \001(\t\022\014\n\004unit\030\003 \001(\t\0225\n\004t" +
      "ype\030\004 \001(\0162\'.opencensus.proto.stats.v1.Me" +
      "asure.Type\"3\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000" +
      "\022\t\n\005INT64\020\001\022\n\n\006DOUBLE\020\002\"\271\003\n\004View\022\014\n\004name" +
      "\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\0223\n\007measure\030\003" +
      " \001(\0132\".opencensus.proto.stats.v1.Measure" +
      "\022\017\n\007columns\030\004 \003(\t\022H\n\021count_aggregation\030\005" +
      " \001(\0132+.opencensus.proto.stats.v1.CountAg" +
      "gregationH\000\022D\n\017sum_aggregation\030\006 \001(\0132).o" +
      "pencensus.proto.stats.v1.SumAggregationH" +
      "\000\022Q\n\026last_value_aggregation\030\007 \001(\0132/.open" +
      "census.proto.stats.v1.LastValueAggregati" +
      "onH\000\022V\n\030distribution_aggregation\030\010 \001(\01322" +
      ".opencensus.proto.stats.v1.DistributionA" +
      "ggregationH\000B\r\n\013aggregation\"\022\n\020CountAggr" +
      "egation\"\020\n\016SumAggregation\"\026\n\024LastValueAg" +
      "gregation\"0\n\027DistributionAggregation\022\025\n\r" +
      "bucket_bounds\030\001 \003(\001\"\261\001\n\013Measurement\022,\n\004t" +
      "ags\030\001 \003(\0132\036.opencensus.proto.stats.v1.Ta" +
      "g\022\024\n\014measure_name\030\002 \001(\t\022\026\n\014double_value\030" +
      "\003 \001(\001H\000\022\023\n\tint_value\030\004 \001(\003H\000\022(\n\004time\030\005 \001" +
      "(\0132\032.google.protobuf.TimestampB\007\n\005valueB" +
      "p\n\034io.opencensus.proto.stats.v1B\nStatsPr" +
      "otoP\001ZBgithub.com/census-instrumentation" +
      "/opencensus-proto/gen-go/stats/v1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_opencensus_proto_stats_v1_Tag_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencensus_proto_stats_v1_Tag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_Tag_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_opencensus_proto_stats_v1_Measure_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencensus_proto_stats_v1_Measure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_Measure_descriptor,
        new java.lang.String[] { "Name", "Description", "Unit", "Type", });
    internal_static_opencensus_proto_stats_v1_View_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencensus_proto_stats_v1_View_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_View_descriptor,
        new java.lang.String[] { "Name", "Description", "Measure", "Columns", "CountAggregation", "SumAggregation", "LastValueAggregation", "DistributionAggregation", "Aggregation", });
    internal_static_opencensus_proto_stats_v1_CountAggregation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencensus_proto_stats_v1_CountAggregation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_CountAggregation_descriptor,
        new java.lang.String[] { });
    internal_static_opencensus_proto_stats_v1_SumAggregation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opencensus_proto_stats_v1_SumAggregation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_SumAggregation_descriptor,
        new java.lang.String[] { });
    internal_static_opencensus_proto_stats_v1_LastValueAggregation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opencensus_proto_stats_v1_LastValueAggregation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_LastValueAggregation_descriptor,
        new java.lang.String[] { });
    internal_static_opencensus_proto_stats_v1_DistributionAggregation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opencensus_proto_stats_v1_DistributionAggregation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_DistributionAggregation_descriptor,
        new java.lang.String[] { "BucketBounds", });
    internal_static_opencensus_proto_stats_v1_Measurement_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opencensus_proto_stats_v1_Measurement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_stats_v1_Measurement_descriptor,
        new java.lang.String[] { "Tags", "MeasureName", "DoubleValue", "IntValue", "Time", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
