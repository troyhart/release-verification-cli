package com.mgl.releaseverification;

import picocli.CommandLine;

import javax.enterprise.context.Dependent;

@CommandLine.Command(name = "hello", description = "Say hello!")
public class HelloCommand implements Runnable {

    private final GreetingService greetingService;

    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;

    public HelloCommand(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void run() {
        greetingService.sayHello(name);
    }
}

