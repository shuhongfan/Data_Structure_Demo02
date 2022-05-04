package com.shf.algorithm.test;

import com.shf.algorithm.sort.Selection;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionTest {
    @Test
    public void test1(){
        Integer[] a ={4,6,8,7,9,2,10,1};

        Selection.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
