package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void test() {
        assertEquals(1,1);
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
//        assertArrayEquals(expected,actuals);

    }
}
