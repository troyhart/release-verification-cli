package com.mgl.releaseverification;

import picocli.CommandLine;

@CommandLine.Command(name = "goodbye", description = "Say goodbye!")
public class GoodbyeCommand implements Runnable {

    private final GreetingService greetingService;

    @CommandLine.Option(names = {"-n", "--name"}, description = "Who is leaving?", defaultValue = "World")
    String name;

    public GoodbyeCommand(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void run() {
        greetingService.sayGoodbye(name);
    }
}
