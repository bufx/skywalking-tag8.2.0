package io.istio;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * HandleMetricService is implemented by backends that wants to handle request-time 'metric' instances.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: istio/istio-metric.proto")
public final class HandleMetricServiceGrpc {

  private HandleMetricServiceGrpc() {}

  public static final String SERVICE_NAME = "metric.HandleMetricService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.istio.IstioMetricProto.HandleMetricRequest,
      io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult> getHandleMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMetric",
      requestType = io.istio.IstioMetricProto.HandleMetricRequest.class,
      responseType = io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.istio.IstioMetricProto.HandleMetricRequest,
      io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult> getHandleMetricMethod() {
    io.grpc.MethodDescriptor<io.istio.IstioMetricProto.HandleMetricRequest, io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult> getHandleMetricMethod;
    if ((getHandleMetricMethod = HandleMetricServiceGrpc.getHandleMetricMethod) == null) {
      synchronized (HandleMetricServiceGrpc.class) {
        if ((getHandleMetricMethod = HandleMetricServiceGrpc.getHandleMetricMethod) == null) {
          HandleMetricServiceGrpc.getHandleMetricMethod = getHandleMetricMethod =
              io.grpc.MethodDescriptor.<io.istio.IstioMetricProto.HandleMetricRequest, io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.istio.IstioMetricProto.HandleMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult.getDefaultInstance()))
              .setSchemaDescriptor(new HandleMetricServiceMethodDescriptorSupplier("HandleMetric"))
              .build();
        }
      }
    }
    return getHandleMetricMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HandleMetricServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HandleMetricServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HandleMetricServiceStub>() {
        @java.lang.Override
        public HandleMetricServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HandleMetricServiceStub(channel, callOptions);
        }
      };
    return HandleMetricServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HandleMetricServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HandleMetricServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HandleMetricServiceBlockingStub>() {
        @java.lang.Override
        public HandleMetricServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HandleMetricServiceBlockingStub(channel, callOptions);
        }
      };
    return HandleMetricServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HandleMetricServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HandleMetricServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HandleMetricServiceFutureStub>() {
        @java.lang.Override
        public HandleMetricServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HandleMetricServiceFutureStub(channel, callOptions);
        }
      };
    return HandleMetricServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HandleMetricService is implemented by backends that wants to handle request-time 'metric' instances.
   * </pre>
   */
  public static abstract class HandleMetricServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * HandleMetric is called by Mixer at request-time to deliver 'metric' instances to the backend.
     * </pre>
     */
    public void handleMetric(io.istio.IstioMetricProto.HandleMetricRequest request,
        io.grpc.stub.StreamObserver<io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult> responseObserver) {
      asyncUnimplementedUnaryCall(getHandleMetricMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHandleMetricMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.istio.IstioMetricProto.HandleMetricRequest,
                io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult>(
                  this, METHODID_HANDLE_METRIC)))
          .build();
    }
  }

  /**
   * <pre>
   * HandleMetricService is implemented by backends that wants to handle request-time 'metric' instances.
   * </pre>
   */
  public static final class HandleMetricServiceStub extends io.grpc.stub.AbstractAsyncStub<HandleMetricServiceStub> {
    private HandleMetricServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandleMetricServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HandleMetricServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * HandleMetric is called by Mixer at request-time to deliver 'metric' instances to the backend.
     * </pre>
     */
    public void handleMetric(io.istio.IstioMetricProto.HandleMetricRequest request,
        io.grpc.stub.StreamObserver<io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHandleMetricMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * HandleMetricService is implemented by backends that wants to handle request-time 'metric' instances.
   * </pre>
   */
  public static final class HandleMetricServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HandleMetricServiceBlockingStub> {
    private HandleMetricServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandleMetricServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HandleMetricServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * HandleMetric is called by Mixer at request-time to deliver 'metric' instances to the backend.
     * </pre>
     */
    public io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult handleMetric(io.istio.IstioMetricProto.HandleMetricRequest request) {
      return blockingUnaryCall(
          getChannel(), getHandleMetricMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * HandleMetricService is implemented by backends that wants to handle request-time 'metric' instances.
   * </pre>
   */
  public static final class HandleMetricServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HandleMetricServiceFutureStub> {
    private HandleMetricServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandleMetricServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HandleMetricServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * HandleMetric is called by Mixer at request-time to deliver 'metric' instances to the backend.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult> handleMetric(
        io.istio.IstioMetricProto.HandleMetricRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHandleMetricMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE_METRIC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HandleMetricServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HandleMetricServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HANDLE_METRIC:
          serviceImpl.handleMetric((io.istio.IstioMetricProto.HandleMetricRequest) request,
              (io.grpc.stub.StreamObserver<io.istio.api.mixer.adapter.model.v1beta1.ReportProto.ReportResult>) responseObserver);
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

  private static abstract class HandleMetricServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HandleMetricServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.istio.IstioMetricProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HandleMetricService");
    }
  }

  private static final class HandleMetricServiceFileDescriptorSupplier
      extends HandleMetricServiceBaseDescriptorSupplier {
    HandleMetricServiceFileDescriptorSupplier() {}
  }

  private static final class HandleMetricServiceMethodDescriptorSupplier
      extends HandleMetricServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HandleMetricServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HandleMetricServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HandleMetricServiceFileDescriptorSupplier())
              .addMethod(getHandleMetricMethod())
              .build();
        }
      }
    }
    return result;
  }
}
