package inventory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: QuantityManage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "inventory.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<inventory.ProductQuantityRequest,
      inventory.ProductQuantityResponse> getGetProductQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductQuantity",
      requestType = inventory.ProductQuantityRequest.class,
      responseType = inventory.ProductQuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<inventory.ProductQuantityRequest,
      inventory.ProductQuantityResponse> getGetProductQuantityMethod() {
    io.grpc.MethodDescriptor<inventory.ProductQuantityRequest, inventory.ProductQuantityResponse> getGetProductQuantityMethod;
    if ((getGetProductQuantityMethod = InventoryServiceGrpc.getGetProductQuantityMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetProductQuantityMethod = InventoryServiceGrpc.getGetProductQuantityMethod) == null) {
          InventoryServiceGrpc.getGetProductQuantityMethod = getGetProductQuantityMethod =
              io.grpc.MethodDescriptor.<inventory.ProductQuantityRequest, inventory.ProductQuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.ProductQuantityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.ProductQuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetProductQuantity"))
              .build();
        }
      }
    }
    return getGetProductQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventory.RestockRequest,
      inventory.RestockResponse> getRestockProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestockProduct",
      requestType = inventory.RestockRequest.class,
      responseType = inventory.RestockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<inventory.RestockRequest,
      inventory.RestockResponse> getRestockProductMethod() {
    io.grpc.MethodDescriptor<inventory.RestockRequest, inventory.RestockResponse> getRestockProductMethod;
    if ((getRestockProductMethod = InventoryServiceGrpc.getRestockProductMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getRestockProductMethod = InventoryServiceGrpc.getRestockProductMethod) == null) {
          InventoryServiceGrpc.getRestockProductMethod = getRestockProductMethod =
              io.grpc.MethodDescriptor.<inventory.RestockRequest, inventory.RestockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestockProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.RestockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.RestockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("RestockProduct"))
              .build();
        }
      }
    }
    return getRestockProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventory.ProductQuantityMonitorRequest,
      inventory.ProductQuantityMonitorResponse> getMonitorProductQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorProductQuantity",
      requestType = inventory.ProductQuantityMonitorRequest.class,
      responseType = inventory.ProductQuantityMonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<inventory.ProductQuantityMonitorRequest,
      inventory.ProductQuantityMonitorResponse> getMonitorProductQuantityMethod() {
    io.grpc.MethodDescriptor<inventory.ProductQuantityMonitorRequest, inventory.ProductQuantityMonitorResponse> getMonitorProductQuantityMethod;
    if ((getMonitorProductQuantityMethod = InventoryServiceGrpc.getMonitorProductQuantityMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getMonitorProductQuantityMethod = InventoryServiceGrpc.getMonitorProductQuantityMethod) == null) {
          InventoryServiceGrpc.getMonitorProductQuantityMethod = getMonitorProductQuantityMethod =
              io.grpc.MethodDescriptor.<inventory.ProductQuantityMonitorRequest, inventory.ProductQuantityMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorProductQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.ProductQuantityMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.ProductQuantityMonitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("MonitorProductQuantity"))
              .build();
        }
      }
    }
    return getMonitorProductQuantityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub>() {
        @java.lang.Override
        public InventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceStub(channel, callOptions);
        }
      };
    return InventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub>() {
        @java.lang.Override
        public InventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return InventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub>() {
        @java.lang.Override
        public InventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceFutureStub(channel, callOptions);
        }
      };
    return InventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProductQuantity(inventory.ProductQuantityRequest request,
        io.grpc.stub.StreamObserver<inventory.ProductQuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductQuantityMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<inventory.RestockRequest> restockProduct(
        io.grpc.stub.StreamObserver<inventory.RestockResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRestockProductMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<inventory.ProductQuantityMonitorRequest> monitorProductQuantity(
        io.grpc.stub.StreamObserver<inventory.ProductQuantityMonitorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorProductQuantityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InventoryService.
   */
  public static abstract class InventoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InventoryService.
   */
  public static final class InventoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InventoryServiceStub> {
    private InventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductQuantity(inventory.ProductQuantityRequest request,
        io.grpc.stub.StreamObserver<inventory.ProductQuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<inventory.RestockRequest> restockProduct(
        io.grpc.stub.StreamObserver<inventory.RestockResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRestockProductMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<inventory.ProductQuantityMonitorRequest> monitorProductQuantity(
        io.grpc.stub.StreamObserver<inventory.ProductQuantityMonitorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorProductQuantityMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InventoryService.
   */
  public static final class InventoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<inventory.ProductQuantityResponse> getProductQuantity(
        inventory.ProductQuantityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductQuantityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InventoryService.
   */
  public static final class InventoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_PRODUCT_QUANTITY = 0;
  private static final int METHODID_RESTOCK_PRODUCT = 1;
  private static final int METHODID_MONITOR_PRODUCT_QUANTITY = 2;

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
        case METHODID_GET_PRODUCT_QUANTITY:
          serviceImpl.getProductQuantity((inventory.ProductQuantityRequest) request,
              (io.grpc.stub.StreamObserver<inventory.ProductQuantityResponse>) responseObserver);
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
        case METHODID_RESTOCK_PRODUCT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.restockProduct(
              (io.grpc.stub.StreamObserver<inventory.RestockResponse>) responseObserver);
        case METHODID_MONITOR_PRODUCT_QUANTITY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorProductQuantity(
              (io.grpc.stub.StreamObserver<inventory.ProductQuantityMonitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProductQuantityMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              inventory.ProductQuantityRequest,
              inventory.ProductQuantityResponse>(
                service, METHODID_GET_PRODUCT_QUANTITY)))
        .addMethod(
          getRestockProductMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              inventory.RestockRequest,
              inventory.RestockResponse>(
                service, METHODID_RESTOCK_PRODUCT)))
        .addMethod(
          getMonitorProductQuantityMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              inventory.ProductQuantityMonitorRequest,
              inventory.ProductQuantityMonitorResponse>(
                service, METHODID_MONITOR_PRODUCT_QUANTITY)))
        .build();
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return inventory.inventoryImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InventoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getGetProductQuantityMethod())
              .addMethod(getRestockProductMethod())
              .addMethod(getMonitorProductQuantityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
