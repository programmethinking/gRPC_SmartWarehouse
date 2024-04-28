package com.ncirl.streaming.humidityservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Humidity
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: HumidityService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HumidityServiceGrpc {

  private HumidityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ncirl.streaming.HumidityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ncirl.streaming.humidityservice.HumidityInfo,
      com.ncirl.streaming.humidityservice.HumidityInfo> getGetRealHumidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRealHumidity",
      requestType = com.ncirl.streaming.humidityservice.HumidityInfo.class,
      responseType = com.ncirl.streaming.humidityservice.HumidityInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ncirl.streaming.humidityservice.HumidityInfo,
      com.ncirl.streaming.humidityservice.HumidityInfo> getGetRealHumidityMethod() {
    io.grpc.MethodDescriptor<com.ncirl.streaming.humidityservice.HumidityInfo, com.ncirl.streaming.humidityservice.HumidityInfo> getGetRealHumidityMethod;
    if ((getGetRealHumidityMethod = HumidityServiceGrpc.getGetRealHumidityMethod) == null) {
      synchronized (HumidityServiceGrpc.class) {
        if ((getGetRealHumidityMethod = HumidityServiceGrpc.getGetRealHumidityMethod) == null) {
          HumidityServiceGrpc.getGetRealHumidityMethod = getGetRealHumidityMethod =
              io.grpc.MethodDescriptor.<com.ncirl.streaming.humidityservice.HumidityInfo, com.ncirl.streaming.humidityservice.HumidityInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRealHumidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.humidityservice.HumidityInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.humidityservice.HumidityInfo.getDefaultInstance()))
              .setSchemaDescriptor(new HumidityServiceMethodDescriptorSupplier("getRealHumidity"))
              .build();
        }
      }
    }
    return getGetRealHumidityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HumidityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HumidityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HumidityServiceStub>() {
        @java.lang.Override
        public HumidityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HumidityServiceStub(channel, callOptions);
        }
      };
    return HumidityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HumidityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HumidityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HumidityServiceBlockingStub>() {
        @java.lang.Override
        public HumidityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HumidityServiceBlockingStub(channel, callOptions);
        }
      };
    return HumidityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HumidityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HumidityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HumidityServiceFutureStub>() {
        @java.lang.Override
        public HumidityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HumidityServiceFutureStub(channel, callOptions);
        }
      };
    return HumidityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Humidity
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取实时温度
     * </pre>
     */
    default void getRealHumidity(com.ncirl.streaming.humidityservice.HumidityInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.humidityservice.HumidityInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRealHumidityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HumidityService.
   * <pre>
   * Humidity
   * </pre>
   */
  public static abstract class HumidityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HumidityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HumidityService.
   * <pre>
   * Humidity
   * </pre>
   */
  public static final class HumidityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HumidityServiceStub> {
    private HumidityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumidityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HumidityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取实时温度
     * </pre>
     */
    public void getRealHumidity(com.ncirl.streaming.humidityservice.HumidityInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.humidityservice.HumidityInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetRealHumidityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HumidityService.
   * <pre>
   * Humidity
   * </pre>
   */
  public static final class HumidityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HumidityServiceBlockingStub> {
    private HumidityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumidityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HumidityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取实时温度
     * </pre>
     */
    public java.util.Iterator<com.ncirl.streaming.humidityservice.HumidityInfo> getRealHumidity(
        com.ncirl.streaming.humidityservice.HumidityInfo request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetRealHumidityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HumidityService.
   * <pre>
   * Humidity
   * </pre>
   */
  public static final class HumidityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HumidityServiceFutureStub> {
    private HumidityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumidityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HumidityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_REAL_HUMIDITY = 0;

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
        case METHODID_GET_REAL_HUMIDITY:
          serviceImpl.getRealHumidity((com.ncirl.streaming.humidityservice.HumidityInfo) request,
              (io.grpc.stub.StreamObserver<com.ncirl.streaming.humidityservice.HumidityInfo>) responseObserver);
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
          getGetRealHumidityMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.ncirl.streaming.humidityservice.HumidityInfo,
              com.ncirl.streaming.humidityservice.HumidityInfo>(
                service, METHODID_GET_REAL_HUMIDITY)))
        .build();
  }

  private static abstract class HumidityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HumidityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ncirl.streaming.humidityservice.HumidityServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HumidityService");
    }
  }

  private static final class HumidityServiceFileDescriptorSupplier
      extends HumidityServiceBaseDescriptorSupplier {
    HumidityServiceFileDescriptorSupplier() {}
  }

  private static final class HumidityServiceMethodDescriptorSupplier
      extends HumidityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HumidityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HumidityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HumidityServiceFileDescriptorSupplier())
              .addMethod(getGetRealHumidityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
