// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TemperatureService.proto

package com.ncirl.streaming.temperatureservice;

public final class TemperatureServiceProto {
  private TemperatureServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ncirl_streaming_TemperatureInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ncirl_streaming_TemperatureInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TemperatureService.proto\022\023com.ncirl.st" +
      "reaming\"-\n\017TemperatureInfo\022\014\n\004time\030\001 \001(\t" +
      "\022\014\n\004temp\030\002 \001(\t2x\n\022TemperatureService\022b\n\022" +
      "getRealTemperature\022$.com.ncirl.streaming" +
      ".TemperatureInfo\032$.com.ncirl.streaming.T" +
      "emperatureInfo0\001BC\n&com.ncirl.streaming." +
      "temperatureserviceB\027TemperatureServicePr" +
      "otoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_ncirl_streaming_TemperatureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ncirl_streaming_TemperatureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ncirl_streaming_TemperatureInfo_descriptor,
        new java.lang.String[] { "Time", "Temp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
