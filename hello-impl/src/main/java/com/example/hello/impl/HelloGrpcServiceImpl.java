package com.example.hello.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.inject.Singleton;

import example.myapp.helloworld.grpc.GreeterService;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;

@Singleton
public class HelloGrpcServiceImpl implements GreeterService {
	
	@Override
    public CompletionStage<HelloReply> sayHello(HelloRequest in) {
        HelloReply reply = HelloReply
            .newBuilder()
            .setMessage("Hi " + in.getName() + " (gRPC)")
            .build();
        return CompletableFuture.completedFuture(reply);
    }
}
