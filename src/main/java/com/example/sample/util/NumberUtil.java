package com.example.sample.util;

public class NumberUtil {

    public static Long nullToZero(Long value) {
        if (value == null) {
            return 0L;
        }
        return value;
    }

    public static Integer nullToZero(Integer value) {
        if (value == null) {
            return 0;
        }
        return value;
    }
}
