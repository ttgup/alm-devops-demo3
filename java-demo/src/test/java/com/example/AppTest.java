

package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals("WRONG MESSAGE", App.message());
    }
}



