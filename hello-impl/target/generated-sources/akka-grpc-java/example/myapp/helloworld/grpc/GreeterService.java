
// Generated by Akka gRPC. DO NOT EDIT.
package example.myapp.helloworld.grpc;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;


public interface GreeterService {
  
  
  java.util.concurrent.CompletionStage<example.myapp.helloworld.grpc.HelloReply> sayHello(example.myapp.helloworld.grpc.HelloRequest in);
  

  static String name = "helloworld.GreeterService";
  static akka.grpc.ServiceDescription description = new akka.grpc.internal.ServiceDescriptionImpl(name, HelloWorldProto.getDescriptor());

  public static class Serializers {
    
      public static ProtobufSerializer<example.myapp.helloworld.grpc.HelloRequest> HelloRequestSerializer = new GoogleProtobufSerializer<>(example.myapp.helloworld.grpc.HelloRequest.class);
    
      public static ProtobufSerializer<example.myapp.helloworld.grpc.HelloReply> HelloReplySerializer = new GoogleProtobufSerializer<>(example.myapp.helloworld.grpc.HelloReply.class);
    
  }
}
