package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testMessage() {
        String result = App.message();

        assertEquals("Hello from ALM CI/CD!", result);
    }
}
