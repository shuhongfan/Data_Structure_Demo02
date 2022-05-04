package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        //原始数据
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));//{1,2,4,5,7,8,9,10}
    }
}
