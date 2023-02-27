package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        double v = Double.parseDouble(str);
        return v>0;
    }
}
