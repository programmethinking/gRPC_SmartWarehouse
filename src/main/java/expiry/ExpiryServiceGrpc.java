package expiry;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: ExpirationManage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExpiryServiceGrpc {

  private ExpiryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "expiry.ExpiryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<expiry.ProductExpiryRequest,
      expiry.ProductExpiryResponse> getGetProductExpiryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductExpiry",
      requestType = expiry.ProductExpiryRequest.class,
      responseType = expiry.ProductExpiryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expiry.ProductExpiryRequest,
      expiry.ProductExpiryResponse> getGetProductExpiryMethod() {
    io.grpc.MethodDescriptor<expiry.ProductExpiryRequest, expiry.ProductExpiryResponse> getGetProductExpiryMethod;
    if ((getGetProductExpiryMethod = ExpiryServiceGrpc.getGetProductExpiryMethod) == null) {
      synchronized (ExpiryServiceGrpc.class) {
        if ((getGetProductExpiryMethod = ExpiryServiceGrpc.getGetProductExpiryMethod) == null) {
          ExpiryServiceGrpc.getGetProductExpiryMethod = getGetProductExpiryMethod =
              io.grpc.MethodDescriptor.<expiry.ProductExpiryRequest, expiry.ProductExpiryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductExpiry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expiry.ProductExpiryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expiry.ProductExpiryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpiryServiceMethodDescriptorSupplier("GetProductExpiry"))
              .build();
        }
      }
    }
    return getGetProductExpiryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<expiry.ProductExpiryMonitorRequest,
      expiry.ProductExpiryMonitorResponse> getMonitorProductExpiryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorProductExpiry",
      requestType = expiry.ProductExpiryMonitorRequest.class,
      responseType = expiry.ProductExpiryMonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<expiry.ProductExpiryMonitorRequest,
      expiry.ProductExpiryMonitorResponse> getMonitorProductExpiryMethod() {
    io.grpc.MethodDescriptor<expiry.ProductExpiryMonitorRequest, expiry.ProductExpiryMonitorResponse> getMonitorProductExpiryMethod;
    if ((getMonitorProductExpiryMethod = ExpiryServiceGrpc.getMonitorProductExpiryMethod) == null) {
      synchronized (ExpiryServiceGrpc.class) {
        if ((getMonitorProductExpiryMethod = ExpiryServiceGrpc.getMonitorProductExpiryMethod) == null) {
          ExpiryServiceGrpc.getMonitorProductExpiryMethod = getMonitorProductExpiryMethod =
              io.grpc.MethodDescriptor.<expiry.ProductExpiryMonitorRequest, expiry.ProductExpiryMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorProductExpiry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expiry.ProductExpiryMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expiry.ProductExpiryMonitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpiryServiceMethodDescriptorSupplier("MonitorProductExpiry"))
              .build();
        }
      }
    }
    return getMonitorProductExpiryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExpiryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpiryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpiryServiceStub>() {
        @java.lang.Override
        public ExpiryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpiryServiceStub(channel, callOptions);
        }
      };
    return ExpiryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExpiryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpiryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpiryServiceBlockingStub>() {
        @java.lang.Override
        public ExpiryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpiryServiceBlockingStub(channel, callOptions);
        }
      };
    return ExpiryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExpiryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpiryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpiryServiceFutureStub>() {
        @java.lang.Override
        public ExpiryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpiryServiceFutureStub(channel, callOptions);
        }
      };
    return ExpiryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProductExpiry(expiry.ProductExpiryRequest request,
        io.grpc.stub.StreamObserver<expiry.ProductExpiryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductExpiryMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<expiry.ProductExpiryMonitorRequest> monitorProductExpiry(
        io.grpc.stub.StreamObserver<expiry.ProductExpiryMonitorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorProductExpiryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExpiryService.
   */
  public static abstract class ExpiryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExpiryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExpiryService.
   */
  public static final class ExpiryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExpiryServiceStub> {
    private ExpiryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpiryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpiryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductExpiry(expiry.ProductExpiryRequest request,
        io.grpc.stub.StreamObserver<expiry.ProductExpiryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductExpiryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<expiry.ProductExpiryMonitorRequest> monitorProductExpiry(
        io.grpc.stub.StreamObserver<expiry.ProductExpiryMonitorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorProductExpiryMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExpiryService.
   */
  public static final class ExpiryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExpiryServiceBlockingStub> {
    private ExpiryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpiryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpiryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public expiry.ProductExpiryResponse getProductExpiry(expiry.ProductExpiryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductExpiryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExpiryService.
   */
  public static final class ExpiryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExpiryServiceFutureStub> {
    private ExpiryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpiryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpiryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<expiry.ProductExpiryResponse> getProductExpiry(
        expiry.ProductExpiryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductExpiryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_EXPIRY = 0;
  private static final int METHODID_MONITOR_PRODUCT_EXPIRY = 1;

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
        case METHODID_GET_PRODUCT_EXPIRY:
          serviceImpl.getProductExpiry((expiry.ProductExpiryRequest) request,
              (io.grpc.stub.StreamObserver<expiry.ProductExpiryResponse>) responseObserver);
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
        case METHODID_MONITOR_PRODUCT_EXPIRY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorProductExpiry(
              (io.grpc.stub.StreamObserver<expiry.ProductExpiryMonitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProductExpiryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              expiry.ProductExpiryRequest,
              expiry.ProductExpiryResponse>(
                service, METHODID_GET_PRODUCT_EXPIRY)))
        .addMethod(
          getMonitorProductExpiryMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              expiry.ProductExpiryMonitorRequest,
              expiry.ProductExpiryMonitorResponse>(
                service, METHODID_MONITOR_PRODUCT_EXPIRY)))
        .build();
  }

  private static abstract class ExpiryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExpiryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return expiry.expiryImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExpiryService");
    }
  }

  private static final class ExpiryServiceFileDescriptorSupplier
      extends ExpiryServiceBaseDescriptorSupplier {
    ExpiryServiceFileDescriptorSupplier() {}
  }

  private static final class ExpiryServiceMethodDescriptorSupplier
      extends ExpiryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExpiryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExpiryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExpiryServiceFileDescriptorSupplier())
              .addMethod(getGetProductExpiryMethod())
              .addMethod(getMonitorProductExpiryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
