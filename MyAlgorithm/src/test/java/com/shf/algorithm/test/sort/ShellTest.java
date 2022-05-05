package com.shf.algorithm.test.sort;

import com.shf.algorithm.sort.Shell;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ShellTest {
    @Test
    public void test1(){
        Integer[] a = {9,1,2,5,7,4,8,6,3,5};

        Shell.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
