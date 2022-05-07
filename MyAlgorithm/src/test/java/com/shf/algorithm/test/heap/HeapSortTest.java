package com.shf.algorithm.test.heap;

import com.shf.algorithm.heap.HeapSort;
import org.testng.annotations.Test;

import java.util.Arrays;

public class HeapSortTest {
    @Test
    public void test1(){
//        待排序数组
        String[] arr = {"S","O","R","T","E","X","A","M","P","L","E"};
//        通过HeapSort对数组中的元素进行排序
        HeapSort.sort(arr);
//        打印排序后数组的元素
        System.out.println(Arrays.toString(arr));

    }
}
