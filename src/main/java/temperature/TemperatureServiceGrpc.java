package temperature;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: TempManage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemperatureServiceGrpc {

  private TemperatureServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "temperature.TemperatureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<temperature.TemperatureRequest,
      temperature.TemperatureResponse> getGetLatestTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestTemperature",
      requestType = temperature.TemperatureRequest.class,
      responseType = temperature.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<temperature.TemperatureRequest,
      temperature.TemperatureResponse> getGetLatestTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature.TemperatureRequest, temperature.TemperatureResponse> getGetLatestTemperatureMethod;
    if ((getGetLatestTemperatureMethod = TemperatureServiceGrpc.getGetLatestTemperatureMethod) == null) {
      synchronized (TemperatureServiceGrpc.class) {
        if ((getGetLatestTemperatureMethod = TemperatureServiceGrpc.getGetLatestTemperatureMethod) == null) {
          TemperatureServiceGrpc.getGetLatestTemperatureMethod = getGetLatestTemperatureMethod =
              io.grpc.MethodDescriptor.<temperature.TemperatureRequest, temperature.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureServiceMethodDescriptorSupplier("GetLatestTemperature"))
              .build();
        }
      }
    }
    return getGetLatestTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<temperature.FridgeControlRequest,
      temperature.FridgeControlResponse> getControlFridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlFridge",
      requestType = temperature.FridgeControlRequest.class,
      responseType = temperature.FridgeControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<temperature.FridgeControlRequest,
      temperature.FridgeControlResponse> getControlFridgeMethod() {
    io.grpc.MethodDescriptor<temperature.FridgeControlRequest, temperature.FridgeControlResponse> getControlFridgeMethod;
    if ((getControlFridgeMethod = TemperatureServiceGrpc.getControlFridgeMethod) == null) {
      synchronized (TemperatureServiceGrpc.class) {
        if ((getControlFridgeMethod = TemperatureServiceGrpc.getControlFridgeMethod) == null) {
          TemperatureServiceGrpc.getControlFridgeMethod = getControlFridgeMethod =
              io.grpc.MethodDescriptor.<temperature.FridgeControlRequest, temperature.FridgeControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlFridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.FridgeControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.FridgeControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureServiceMethodDescriptorSupplier("ControlFridge"))
              .build();
        }
      }
    }
    return getControlFridgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<temperature.TemperatureMonitorRequest,
      temperature.TemperatureMonitorResponse> getMonitorTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorTemperature",
      requestType = temperature.TemperatureMonitorRequest.class,
      responseType = temperature.TemperatureMonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<temperature.TemperatureMonitorRequest,
      temperature.TemperatureMonitorResponse> getMonitorTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature.TemperatureMonitorRequest, temperature.TemperatureMonitorResponse> getMonitorTemperatureMethod;
    if ((getMonitorTemperatureMethod = TemperatureServiceGrpc.getMonitorTemperatureMethod) == null) {
      synchronized (TemperatureServiceGrpc.class) {
        if ((getMonitorTemperatureMethod = TemperatureServiceGrpc.getMonitorTemperatureMethod) == null) {
          TemperatureServiceGrpc.getMonitorTemperatureMethod = getMonitorTemperatureMethod =
              io.grpc.MethodDescriptor.<temperature.TemperatureMonitorRequest, temperature.TemperatureMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.TemperatureMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.TemperatureMonitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureServiceMethodDescriptorSupplier("MonitorTemperature"))
              .build();
        }
      }
    }
    return getMonitorTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureServiceStub>() {
        @java.lang.Override
        public TemperatureServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureServiceStub(channel, callOptions);
        }
      };
    return TemperatureServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureServiceBlockingStub>() {
        @java.lang.Override
        public TemperatureServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureServiceBlockingStub(channel, callOptions);
        }
      };
    return TemperatureServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureServiceFutureStub>() {
        @java.lang.Override
        public TemperatureServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureServiceFutureStub(channel, callOptions);
        }
      };
    return TemperatureServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getLatestTemperature(temperature.TemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestTemperatureMethod(), responseObserver);
    }

    /**
     */
    default void controlFridge(temperature.FridgeControlRequest request,
        io.grpc.stub.StreamObserver<temperature.FridgeControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getControlFridgeMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<temperature.TemperatureMonitorRequest> monitorTemperature(
        io.grpc.stub.StreamObserver<temperature.TemperatureMonitorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TemperatureService.
   */
  public static abstract class TemperatureServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TemperatureServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TemperatureService.
   */
  public static final class TemperatureServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TemperatureServiceStub> {
    private TemperatureServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLatestTemperature(temperature.TemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void controlFridge(temperature.FridgeControlRequest request,
        io.grpc.stub.StreamObserver<temperature.FridgeControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getControlFridgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<temperature.TemperatureMonitorRequest> monitorTemperature(
        io.grpc.stub.StreamObserver<temperature.TemperatureMonitorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TemperatureService.
   */
  public static final class TemperatureServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TemperatureServiceBlockingStub> {
    private TemperatureServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public temperature.TemperatureResponse getLatestTemperature(temperature.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public temperature.FridgeControlResponse controlFridge(temperature.FridgeControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getControlFridgeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TemperatureService.
   */
  public static final class TemperatureServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TemperatureServiceFutureStub> {
    private TemperatureServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<temperature.TemperatureResponse> getLatestTemperature(
        temperature.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<temperature.FridgeControlResponse> controlFridge(
        temperature.FridgeControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getControlFridgeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LATEST_TEMPERATURE = 0;
  private static final int METHODID_CONTROL_FRIDGE = 1;
  private static final int METHODID_MONITOR_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LATEST_TEMPERATURE:
          serviceImpl.getLatestTemperature((temperature.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<temperature.TemperatureResponse>) responseObserver);
          break;
        case METHODID_CONTROL_FRIDGE:
          serviceImpl.controlFridge((temperature.FridgeControlRequest) request,
              (io.grpc.stub.StreamObserver<temperature.FridgeControlResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorTemperature(
              (io.grpc.stub.StreamObserver<temperature.TemperatureMonitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetLatestTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              temperature.TemperatureRequest,
              temperature.TemperatureResponse>(
                service, METHODID_GET_LATEST_TEMPERATURE)))
        .addMethod(
          getControlFridgeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              temperature.FridgeControlRequest,
              temperature.FridgeControlResponse>(
                service, METHODID_CONTROL_FRIDGE)))
        .addMethod(
          getMonitorTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              temperature.TemperatureMonitorRequest,
              temperature.TemperatureMonitorResponse>(
                service, METHODID_MONITOR_TEMPERATURE)))
        .build();
  }

  private static abstract class TemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return temperature.temperatureImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemperatureService");
    }
  }

  private static final class TemperatureServiceFileDescriptorSupplier
      extends TemperatureServiceBaseDescriptorSupplier {
    TemperatureServiceFileDescriptorSupplier() {}
  }

  private static final class TemperatureServiceMethodDescriptorSupplier
      extends TemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TemperatureServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TemperatureServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureServiceFileDescriptorSupplier())
              .addMethod(getGetLatestTemperatureMethod())
              .addMethod(getControlFridgeMethod())
              .addMethod(getMonitorTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
