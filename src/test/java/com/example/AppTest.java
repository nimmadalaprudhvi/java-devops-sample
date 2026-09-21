package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testGreeting() {
        assertEquals("Hello, DevOps", App.greet("DevOps"));
    }

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3));
    }
}
