package com.epam.rd.autotasks.max;
import java.util.Arrays;
public class MaxMethod {
    public static int max(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
