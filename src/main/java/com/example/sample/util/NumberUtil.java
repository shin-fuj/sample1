package com.example.sample.util;

public class NumberUtil {

    public static Long nullToZero(Long value) {
        // TODO: hogehoge
        if (value == null) {
            return 0L;
        }
        // FIXME: fuga
        return value;
    }

    public static Integer nullToZero(Integer value) {
        if (value == null) {
            return 0;
        }
        return value;
    }

    public static String valueOf(int value) {
        return Integer.valueOf(value).toString();
    }
}
