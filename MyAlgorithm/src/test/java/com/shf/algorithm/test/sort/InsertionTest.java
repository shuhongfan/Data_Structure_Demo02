package com.shf.algorithm.test.sort;

import com.shf.algorithm.sort.Insertion;
import com.shf.algorithm.sort.demo.MySort;
import org.testng.annotations.Test;

import java.util.Arrays;

public class InsertionTest {
    @Test
    public void test1() {
        Integer[] a= {4,3,2,10,12,1,5,6};

        Insertion.sort(a);

        System.out.println(Arrays.toString(a));
    }

    @Test
    public void test2() {
        Integer[] a= {4,3,2,10,12,1,5,6};

        MySort.InsertSort(a);

        System.out.println(Arrays.toString(a));
    }
}
