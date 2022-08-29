package com.ahmad;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {
    public int fib(int n) {
        if (n <= 1)
            return 1;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
