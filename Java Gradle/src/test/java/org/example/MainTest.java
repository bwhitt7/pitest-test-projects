package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main m;
    @BeforeEach
    void setUp() {
        m = new Main();
    }

    @Test
    void add() {
        assertEquals(10, m.add(5, 5));
    }

    @Test
    void multiply() {
        assertEquals(25, m.multiply(5, 5));
    }
}