package com.shf.algorithm.sort;

public class Selection {

    /**
     * 对数据a中的元素进行选择排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
//            定义一个变量，记录最小元素所在的索引，默认认为参数选择排序的第一个元素所在的位置
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }
//            交换最小元素所在的索引minIndex处的值和索引i处的值
            exch(a,i,minIndex);
        }
    }

    /**
     * 比较v元素是否大于w元素
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 数组元素i和j交换位置
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
