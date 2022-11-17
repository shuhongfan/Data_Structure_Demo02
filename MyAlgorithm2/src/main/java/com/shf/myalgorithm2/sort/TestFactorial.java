package com.shf.myalgorithm2.sort;

public class TestFactorial {
    public static void main(String[] args) {
        long result = factorial(5);
        System.out.println(result);
    }

    /**
     * 求n的阶乘
     * @param n
     * @return
     */
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
