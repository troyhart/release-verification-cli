package com.mgl.releaseverification;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@QuarkusMain
public class HelloWorldMain implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        if (args==null || args.length==0) return 1;

        System.out.println(Stream.of(args).map(String::toUpperCase).collect(Collectors.joining("], [Hello ", "[Hello ", "]")));
        return 0;
    }
}