package com.ncirl.streaming.storeservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: StoreService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ncirl.streaming.StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfos> getGetProductsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductsInfo",
      requestType = com.ncirl.streaming.storeservice.ProductInfo.class,
      responseType = com.ncirl.streaming.storeservice.ProductInfos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfos> getGetProductsInfoMethod() {
    io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfos> getGetProductsInfoMethod;
    if ((getGetProductsInfoMethod = StoreServiceGrpc.getGetProductsInfoMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetProductsInfoMethod = StoreServiceGrpc.getGetProductsInfoMethod) == null) {
          StoreServiceGrpc.getGetProductsInfoMethod = getGetProductsInfoMethod =
              io.grpc.MethodDescriptor.<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfos.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("getProductsInfo"))
              .build();
        }
      }
    }
    return getGetProductsInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfo> getGetAllProductsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProductsInfo",
      requestType = com.ncirl.streaming.storeservice.ProductInfo.class,
      responseType = com.ncirl.streaming.storeservice.ProductInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfo> getGetAllProductsInfoMethod() {
    io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfo> getGetAllProductsInfoMethod;
    if ((getGetAllProductsInfoMethod = StoreServiceGrpc.getGetAllProductsInfoMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetAllProductsInfoMethod = StoreServiceGrpc.getGetAllProductsInfoMethod) == null) {
          StoreServiceGrpc.getGetAllProductsInfoMethod = getGetAllProductsInfoMethod =
              io.grpc.MethodDescriptor.<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllProductsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfo.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("getAllProductsInfo"))
              .build();
        }
      }
    }
    return getGetAllProductsInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfos> getUpdateProductInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProductInfo",
      requestType = com.ncirl.streaming.storeservice.ProductInfo.class,
      responseType = com.ncirl.streaming.storeservice.ProductInfos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfos> getUpdateProductInfoMethod() {
    io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfos> getUpdateProductInfoMethod;
    if ((getUpdateProductInfoMethod = StoreServiceGrpc.getUpdateProductInfoMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getUpdateProductInfoMethod = StoreServiceGrpc.getUpdateProductInfoMethod) == null) {
          StoreServiceGrpc.getUpdateProductInfoMethod = getUpdateProductInfoMethod =
              io.grpc.MethodDescriptor.<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProductInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfos.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("updateProductInfo"))
              .build();
        }
      }
    }
    return getUpdateProductInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfos> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = com.ncirl.streaming.storeservice.ProductInfo.class,
      responseType = com.ncirl.streaming.storeservice.ProductInfos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo,
      com.ncirl.streaming.storeservice.ProductInfos> getUploadMethod() {
    io.grpc.MethodDescriptor<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfos> getUploadMethod;
    if ((getUploadMethod = StoreServiceGrpc.getUploadMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getUploadMethod = StoreServiceGrpc.getUploadMethod) == null) {
          StoreServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<com.ncirl.streaming.storeservice.ProductInfo, com.ncirl.streaming.storeservice.ProductInfos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ncirl.streaming.storeservice.ProductInfos.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub>() {
        @java.lang.Override
        public StoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceStub(channel, callOptions);
        }
      };
    return StoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub>() {
        @java.lang.Override
        public StoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceBlockingStub(channel, callOptions);
        }
      };
    return StoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub>() {
        @java.lang.Override
        public StoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceFutureStub(channel, callOptions);
        }
      };
    return StoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 获取某个商品库存列表
     * </pre>
     */
    default void getProductsInfo(com.ncirl.streaming.storeservice.ProductInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取全部库存列表
     * </pre>
     */
    default void getAllProductsInfo(com.ncirl.streaming.storeservice.ProductInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProductsInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据productNo修改库存
     * </pre>
     */
    default void updateProductInfo(com.ncirl.streaming.storeservice.ProductInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量上传修改库存
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfo> upload(
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StoreService.
   */
  public static abstract class StoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StoreService.
   */
  public static final class StoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StoreServiceStub> {
    private StoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取某个商品库存列表
     * </pre>
     */
    public void getProductsInfo(com.ncirl.streaming.storeservice.ProductInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取全部库存列表
     * </pre>
     */
    public void getAllProductsInfo(com.ncirl.streaming.storeservice.ProductInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllProductsInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据productNo修改库存
     * </pre>
     */
    public void updateProductInfo(com.ncirl.streaming.storeservice.ProductInfo request,
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量上传修改库存
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfo> upload(
        io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StoreService.
   */
  public static final class StoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取某个商品库存列表
     * </pre>
     */
    public com.ncirl.streaming.storeservice.ProductInfos getProductsInfo(com.ncirl.streaming.storeservice.ProductInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取全部库存列表
     * </pre>
     */
    public java.util.Iterator<com.ncirl.streaming.storeservice.ProductInfo> getAllProductsInfo(
        com.ncirl.streaming.storeservice.ProductInfo request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllProductsInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据productNo修改库存
     * </pre>
     */
    public com.ncirl.streaming.storeservice.ProductInfos updateProductInfo(com.ncirl.streaming.storeservice.ProductInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StoreService.
   */
  public static final class StoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取某个商品库存列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ncirl.streaming.storeservice.ProductInfos> getProductsInfo(
        com.ncirl.streaming.storeservice.ProductInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据productNo修改库存
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ncirl.streaming.storeservice.ProductInfos> updateProductInfo(
        com.ncirl.streaming.storeservice.ProductInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS_INFO = 0;
  private static final int METHODID_GET_ALL_PRODUCTS_INFO = 1;
  private static final int METHODID_UPDATE_PRODUCT_INFO = 2;
  private static final int METHODID_UPLOAD = 3;

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
        case METHODID_GET_PRODUCTS_INFO:
          serviceImpl.getProductsInfo((com.ncirl.streaming.storeservice.ProductInfo) request,
              (io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCTS_INFO:
          serviceImpl.getAllProductsInfo((com.ncirl.streaming.storeservice.ProductInfo) request,
              (io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfo>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT_INFO:
          serviceImpl.updateProductInfo((com.ncirl.streaming.storeservice.ProductInfo) request,
              (io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos>) responseObserver);
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
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<com.ncirl.streaming.storeservice.ProductInfos>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProductsInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ncirl.streaming.storeservice.ProductInfo,
              com.ncirl.streaming.storeservice.ProductInfos>(
                service, METHODID_GET_PRODUCTS_INFO)))
        .addMethod(
          getGetAllProductsInfoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.ncirl.streaming.storeservice.ProductInfo,
              com.ncirl.streaming.storeservice.ProductInfo>(
                service, METHODID_GET_ALL_PRODUCTS_INFO)))
        .addMethod(
          getUpdateProductInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ncirl.streaming.storeservice.ProductInfo,
              com.ncirl.streaming.storeservice.ProductInfos>(
                service, METHODID_UPDATE_PRODUCT_INFO)))
        .addMethod(
          getUploadMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.ncirl.streaming.storeservice.ProductInfo,
              com.ncirl.streaming.storeservice.ProductInfos>(
                service, METHODID_UPLOAD)))
        .build();
  }

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ncirl.streaming.storeservice.StoreServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getGetProductsInfoMethod())
              .addMethod(getGetAllProductsInfoMethod())
              .addMethod(getUpdateProductInfoMethod())
              .addMethod(getUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
