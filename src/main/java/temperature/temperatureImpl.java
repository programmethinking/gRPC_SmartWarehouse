// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TempManage.proto

// Protobuf Java Version: 3.25.1
package temperature;

public final class temperatureImpl {
  private temperatureImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_TemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperature_TemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_TemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperature_TemperatureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_FridgeControlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperature_FridgeControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_FridgeControlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperature_FridgeControlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_TemperatureMonitorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperature_TemperatureMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_TemperatureMonitorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperature_TemperatureMonitorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020TempManage.proto\022\013temperature\"\"\n\022Tempe" +
      "ratureRequest\022\014\n\004date\030\001 \001(\t\"8\n\023Temperatu" +
      "reResponse\022\014\n\004date\030\001 \001(\t\022\023\n\013temperature\030" +
      "\002 \001(\002\"|\n\024FridgeControlRequest\0228\n\006action\030" +
      "\001 \001(\0162(.temperature.FridgeControlRequest" +
      ".Action\"*\n\006Action\022\013\n\007UNKNOWN\020\000\022\010\n\004OPEN\020\001" +
      "\022\t\n\005CLOSE\020\002\"\'\n\025FridgeControlResponse\022\016\n\006" +
      "status\030\001 \001(\t\">\n\031TemperatureMonitorReques" +
      "t\022\014\n\004date\030\001 \001(\t\022\023\n\013temperature\030\002 \001(\002\",\n\032" +
      "TemperatureMonitorResponse\022\016\n\006status\030\001 \001" +
      "(\t2\266\002\n\022TemperatureService\022[\n\024GetLatestTe" +
      "mperature\022\037.temperature.TemperatureReque" +
      "st\032 .temperature.TemperatureResponse\"\000\022V" +
      "\n\rControlFridge\022!.temperature.FridgeCont" +
      "rolRequest\032\".temperature.FridgeControlRe" +
      "sponse\022k\n\022MonitorTemperature\022&.temperatu" +
      "re.TemperatureMonitorRequest\032\'.temperatu" +
      "re.TemperatureMonitorResponse\"\000(\0010\001B \n\013t" +
      "emperatureB\017temperatureImplP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_temperature_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_temperature_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperature_TemperatureRequest_descriptor,
        new java.lang.String[] { "Date", });
    internal_static_temperature_TemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_temperature_TemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperature_TemperatureResponse_descriptor,
        new java.lang.String[] { "Date", "Temperature", });
    internal_static_temperature_FridgeControlRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_temperature_FridgeControlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperature_FridgeControlRequest_descriptor,
        new java.lang.String[] { "Action", });
    internal_static_temperature_FridgeControlResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_temperature_FridgeControlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperature_FridgeControlResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_temperature_TemperatureMonitorRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_temperature_TemperatureMonitorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperature_TemperatureMonitorRequest_descriptor,
        new java.lang.String[] { "Date", "Temperature", });
    internal_static_temperature_TemperatureMonitorResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_temperature_TemperatureMonitorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperature_TemperatureMonitorResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
