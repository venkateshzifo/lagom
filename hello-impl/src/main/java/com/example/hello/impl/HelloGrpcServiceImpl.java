package com.example.hello.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.example.hello.impl.grpc.AbstractGreeterServiceRouter;
import com.example.hello.impl.grpc.HelloReply;
import com.example.hello.impl.grpc.HelloRequest;

import akka.actor.ActorSystem;
import akka.stream.Materializer;

@Singleton
public class HelloGrpcServiceImpl extends AbstractGreeterServiceRouter {
	@Inject
	public HelloGrpcServiceImpl(ActorSystem sys, Materializer mat) {
		super(mat, sys);
	}

	@Override
	public CompletionStage<HelloReply> sayHello(HelloRequest in) {
		HelloReply reply = HelloReply.newBuilder().setMessage("Hi " + in.getName() + " (gRPC) ASDSADSA").build();
		return CompletableFuture.completedFuture(reply);
	}

}
