package com.shf.algorithm.test.sort;

import org.testng.annotations.Test;

public class TestFactorial {
    @Test
    public void test1(){
//        求n的阶乘
        long result = factorial(5);
        System.out.println(result);
    }


//    求n的阶乘
    public static long factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
