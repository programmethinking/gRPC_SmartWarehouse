// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HumidityService.proto

package com.ncirl.streaming.humidityservice;

public final class HumidityServiceProto {
  private HumidityServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ncirl_streaming_HumidityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ncirl_streaming_HumidityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025HumidityService.proto\022\023com.ncirl.strea" +
      "ming\".\n\014HumidityInfo\022\014\n\004time\030\001 \001(\t\022\020\n\010hu" +
      "midity\030\002 \001(\t2l\n\017HumidityService\022Y\n\017getRe" +
      "alHumidity\022!.com.ncirl.streaming.Humidit" +
      "yInfo\032!.com.ncirl.streaming.HumidityInfo" +
      "0\001B=\n#com.ncirl.streaming.humidityservic" +
      "eB\024HumidityServiceProtoP\001b\006proto3"
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
    internal_static_com_ncirl_streaming_HumidityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ncirl_streaming_HumidityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ncirl_streaming_HumidityInfo_descriptor,
        new java.lang.String[] { "Time", "Humidity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
