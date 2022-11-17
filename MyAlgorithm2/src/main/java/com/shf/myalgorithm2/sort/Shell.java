package com.shf.myalgorithm2.sort;

import java.util.Arrays;

public class Shell {

    public static void main(String[] args) {
        Integer[] a = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        Shell.sort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
//        1.根据数组a的长度，确定增长量h的初始值
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }

//        2. 希尔排序
        while (h >= 1) {
//            排序
//            2.1 找到待插入的元素
            for (int i = h; i < a.length; i++) {
//                2.2 把待插入的元素插入到有序数组中
                for (int j = i; j >= h; j -= h) {
//                    待插入的元素是 a[j]，比较a[j] 和a[j - h];
                    if (greater(a[j - h], a[j])) {
//                        交换元素
                        exch(a, j - h, j);
                    } else {
                         // 待插入元素已经找到了合适位置，结束循环
                        break;
                    }
                }
            }

            h = h / 2;
        }

    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }


    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
