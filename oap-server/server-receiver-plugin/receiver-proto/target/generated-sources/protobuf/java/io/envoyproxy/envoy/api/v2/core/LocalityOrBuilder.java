// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.envoyproxy.envoy.api.v2.core;

public interface LocalityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.core.Locality)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
   * </pre>
   *
   * <code>string region = 1;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
   * </pre>
   *
   * <code>string region = 1;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Defines the local service zone where Envoy is running. Though optional, it
   * should be set if discovery service routing is used and the discovery
   * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
   * either in this message or via :option:`--service-zone`. The meaning of zone
   * is context dependent, e.g. `Availability Zone (AZ)
   * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
   * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
   * GCP, etc.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Defines the local service zone where Envoy is running. Though optional, it
   * should be set if discovery service routing is used and the discovery
   * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
   * either in this message or via :option:`--service-zone`. The meaning of zone
   * is context dependent, e.g. `Availability Zone (AZ)
   * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
   * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
   * GCP, etc.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * When used for locality of upstream hosts, this field further splits zone
   * into smaller chunks of sub-zones so they can be load balanced
   * independently.
   * </pre>
   *
   * <code>string sub_zone = 3;</code>
   * @return The subZone.
   */
  java.lang.String getSubZone();
  /**
   * <pre>
   * When used for locality of upstream hosts, this field further splits zone
   * into smaller chunks of sub-zones so they can be load balanced
   * independently.
   * </pre>
   *
   * <code>string sub_zone = 3;</code>
   * @return The bytes for subZone.
   */
  com.google.protobuf.ByteString
      getSubZoneBytes();
}
