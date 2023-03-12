package com.epam.rd.autotasks.max;

import java.util.*;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;
        if (values != null && values.length > 0){
            int max = values[0];
            for (int i = 1; i < values.length; i++)
                max = Math.max(max, values[i]);
            result = OptionalInt.of(max);
        } else result = OptionalInt.empty();
        return  result;
    }
}
