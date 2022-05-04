package cn.itcast.algorithm.test;

import cn.itcast.algorithm.heap.HeapSort;

import java.util.Arrays;

public class HeapSortTest {

    public static void main(String[] args) {
        //待排序数组
        String[] arr = {"S","O","R","T","E","X","A","M","P","L","E"};
        //通过HeapSort对数组中的元素进行排序
        HeapSort.sort(arr);
        //打印排序后数组中的元素
        System.out.println(Arrays.toString(arr));
    }
}
