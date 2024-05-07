package com.example.sample.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilTest {
    @Test
    void testNullToZeroLong() {
        Long longValue = null;
        assertEquals(0, NumberUtil.nullToZero(longValue));
    }

    @Test
    void testNullToZeroInteger() {
        assertEquals(1, NumberUtil.nullToZero(1));
    }
}
