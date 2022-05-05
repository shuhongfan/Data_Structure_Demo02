package com.shf.algorithm.test.sort;

import com.shf.algorithm.sort.Quick;
import org.testng.annotations.Test;

import java.util.Arrays;

public class QuickTest {
    @Test
    public void test1(){
        Integer[] a={6,1,2,7,9,3,4,5,8};

        Quick.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
