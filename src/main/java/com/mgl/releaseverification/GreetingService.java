package com.mgl.releaseverification;

import javax.enterprise.context.Dependent;

@Dependent
class GreetingService {
    void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
    void sayGoodbye(String name) {
        System.out.println("Bye bye " + name + "!");
    }
}
