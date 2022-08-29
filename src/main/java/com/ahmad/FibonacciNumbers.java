package com.ahmad;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {
    Map<Integer, Integer> fibonacciMapping = new HashMap<>();

    public int fib(int n) {
        int returnValue = 0;
        if (fibonacciMapping.containsKey(n))
            returnValue = fibonacciMapping.get(n);
        if (n <= 2)
            returnValue = 1;
        else {
            returnValue = fib(n - 1) + fib(n - 2);
        }
        fibonacciMapping.put(n, returnValue);
        return returnValue;
    }
}
