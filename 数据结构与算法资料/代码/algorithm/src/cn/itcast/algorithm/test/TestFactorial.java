package cn.itcast.algorithm.test;

public class TestFactorial {

    public static void main(String[] args) {
        //求N的阶乘
        long result = factorial(100000);
        System.out.println(result);
    }


    //求n的阶乘
    public static long factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
