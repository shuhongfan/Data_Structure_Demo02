package com.shf.algorithm.test.sort;

import com.shf.algorithm.sort.Merge;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeTest {
    @Test
    public void test1(){
        Integer[] a = {8,4,5,7,1,3,6,2};

        Merge.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
