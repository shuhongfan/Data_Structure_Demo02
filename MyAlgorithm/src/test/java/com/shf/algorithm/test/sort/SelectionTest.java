package com.shf.algorithm.test.sort;

import com.shf.algorithm.sort.Selection;
import com.shf.algorithm.sort.demo.MySort;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionTest {
    @Test
    public void test1(){
        Integer[] a ={4,6,8,7,9,2,10,1};

        Selection.sort(a);

        System.out.println(Arrays.toString(a));
    }

    @Test
    public void test2(){
        Integer[] a ={4,6,8,7,9,2,10,1};

        MySort.SelectionSort(a);

        System.out.println(Arrays.toString(a));
    }
}
