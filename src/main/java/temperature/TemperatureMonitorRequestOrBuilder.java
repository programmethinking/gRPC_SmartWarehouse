// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TempManage.proto

// Protobuf Java Version: 3.25.1
package temperature;

public interface TemperatureMonitorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:temperature.TemperatureMonitorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string date = 1;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <code>string date = 1;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>float temperature = 2;</code>
   * @return The temperature.
   */
  float getTemperature();
}
