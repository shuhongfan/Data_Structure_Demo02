package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Quick;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        Integer[] a= {6, 1, 2, 7, 9, 3, 4, 5, 8};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));//{1, 2, 3, 4, 5, 6, 7, 8, 9}
    }
}
