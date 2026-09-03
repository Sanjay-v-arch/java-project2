package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void helloShouldReturnExpectedMessage() {
        HelloController controller = new HelloController();

        String result = controller.hello();

        assertEquals("Hello from Project 2 - Jenkins CI/CD!", result);
    }
}
