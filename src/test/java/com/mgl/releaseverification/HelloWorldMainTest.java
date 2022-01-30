package com.mgl.releaseverification;

import io.quarkus.test.junit.main.Launch;
import io.quarkus.test.junit.main.LaunchResult;
import io.quarkus.test.junit.main.QuarkusMainLauncher;
import io.quarkus.test.junit.main.QuarkusMainTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusMainTest
class HelloWorldMainTest {

    @Test
    @Launch("World")
    public void testLaunchCommand(LaunchResult result) {
        Assertions.assertEquals("[Hello WORLD]", result.getOutput());
    }

    @Test
    @Launch({"world", "bOy"})
    public void testLaunchCommandWithMultipleArgs(LaunchResult result) {
        Assertions.assertEquals("[Hello WORLD], [Hello BOY]", result.getOutput());
    }

    @Test
    @Launch(value = {}, exitCode = 1)
    public void testLaunchCommandFailed() {
    }

    @Test
    public void testManualLaunch(QuarkusMainLauncher launcher) {
        LaunchResult result = launcher.launch("Everyone");
        Assertions.assertEquals(0, result.exitCode());
        Assertions.assertEquals("[Hello EVERYONE]", result.getOutput());
    }
}