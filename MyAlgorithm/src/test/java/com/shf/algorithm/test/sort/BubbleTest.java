package com.shf.algorithm.test.sort;

import com.shf.algorithm.sort.Bubble;
import com.shf.algorithm.sort.demo.MySort;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleTest {
    @Test
    public void test1(){
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Integer[] arr = {4,5,6,3,2,1};
        MySort.BubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
