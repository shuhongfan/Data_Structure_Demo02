package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));//{1,2,3,4,5,6}
    }

}
