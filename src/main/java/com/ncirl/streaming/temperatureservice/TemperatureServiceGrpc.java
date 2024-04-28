package com.ncirl.streaming.temperatureservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Temperature
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: TemperatureService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemperatureServiceGrpc {

  private TemperatureServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ncirl.streaming.TemperatureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ncirl.streaming.temperatureservice.TemperatureInfo,
      com.ncirl.streaming.temperatureservice.TemperatureInfo> getGetRealTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRealTemperature",
      requestType = com.ncirl.streaming.temperatureservice.TemperatureInfo.class,
      responseType = com.ncirl.streaming.temperatureservice.TemperatureInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ncirl.streaming.temperatureservice.TemperatureInfo,
      com.ncirl.streaming.temperatureservice.TemperatureInfo> getGetRealTemperatureMethod() {
    io.grpc.MethodDescriptor<com.ncirl.streaming.temperatureservice.TemperatureInfo, com.ncirl.streaming.temperatureservice.TemperatureInfo> getGetRealTemperatureMethod;
    if ((getGetRealTemperatureMethod = TemperatureServiceGrpc.getGetRealTemperatureMethod) == null) {
      synchronized (TemperatureServiceGrpc.class) {
        if ((getGetRealTemperatureMethod = TemperatureServiceGrpc.getGetRealTemperatureMethod) == null) {
          TemperatureServiceGrpc.getGetRealTemperatureMethod = getGetRealTemperatureMethod =
              io.grpc.MethodDescriptor.<com.ncirl.streaming.temperatureservice.TemperatureInfo, com.ncirl.streaming.temperatureservice.TemperatureInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRealTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.temperatureservice.TemperatureInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.temperatureservice.TemperatureInfo.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureServiceMethodDescriptorSupplier("getRealTemperature"))
              .build();
        }
      }
    }
    return getGetRealTemperatureMethod;
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
   * <pre>
   * Temperature
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取实时温度
     * </pre>
     */
    default void getRealTemperature(com.ncirl.streaming.temperatureservice.TemperatureInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.temperatureservice.TemperatureInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRealTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TemperatureService.
   * <pre>
   * Temperature
   * </pre>
   */
  public static abstract class TemperatureServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TemperatureServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TemperatureService.
   * <pre>
   * Temperature
   * </pre>
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
     * <pre>
     * 获取实时温度
     * </pre>
     */
    public void getRealTemperature(com.ncirl.streaming.temperatureservice.TemperatureInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.temperatureservice.TemperatureInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetRealTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TemperatureService.
   * <pre>
   * Temperature
   * </pre>
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
     * <pre>
     * 获取实时温度
     * </pre>
     */
    public java.util.Iterator<com.ncirl.streaming.temperatureservice.TemperatureInfo> getRealTemperature(
        com.ncirl.streaming.temperatureservice.TemperatureInfo request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetRealTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TemperatureService.
   * <pre>
   * Temperature
   * </pre>
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
  }

  private static final int METHODID_GET_REAL_TEMPERATURE = 0;

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
        case METHODID_GET_REAL_TEMPERATURE:
          serviceImpl.getRealTemperature((com.ncirl.streaming.temperatureservice.TemperatureInfo) request,
              (io.grpc.stub.StreamObserver<com.ncirl.streaming.temperatureservice.TemperatureInfo>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetRealTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.ncirl.streaming.temperatureservice.TemperatureInfo,
              com.ncirl.streaming.temperatureservice.TemperatureInfo>(
                service, METHODID_GET_REAL_TEMPERATURE)))
        .build();
  }

  private static abstract class TemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ncirl.streaming.temperatureservice.TemperatureServiceProto.getDescriptor();
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
              .addMethod(getGetRealTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
