package com.shf.algorithm.test;

import com.shf.algorithm.sort.Bubble;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleTest {
    @Test
    public void test1(){
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
