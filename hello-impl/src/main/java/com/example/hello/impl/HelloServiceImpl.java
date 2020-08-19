package com.example.hello.impl;

import java.util.concurrent.CompletableFuture;

import com.example.hello.api.HelloService;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import akka.NotUsed;

public class HelloServiceImpl implements HelloService {

    @Override
    public ServiceCall<NotUsed, String> hello(String id) {
        return req -> CompletableFuture.completedFuture("Hi " + id + "!");
    }
}
