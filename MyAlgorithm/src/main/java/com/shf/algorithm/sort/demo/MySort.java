package com.shf.algorithm.sort.demo;

public class MySort {
    /**
     * 冒泡排序
     * @param a
     */
    public static void BubbleSort(Comparable[] a) {
        for (int i = a.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }

    /**
     * 选择排序
     * @param a
     */
    public static void SelectionSort(Comparable[] a){
        int minIndex;
        for (int i = 0; i < a.length; i++) {
            minIndex = i;
            for (int j = i +1; j < a.length; j++) {
                if (greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exch(a,minIndex,i);
        }
    }

    /**
     * 插入排序
     * @param a
     */
    public static void InsertSort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0; j--) {
                if (greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }
            }
        }
    }

    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
