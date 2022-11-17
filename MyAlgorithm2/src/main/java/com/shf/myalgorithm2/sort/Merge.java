package com.shf.myalgorithm2.sort;

public class Merge {
    private static Comparable[] assist;

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sort(Comparable[] a) {
        assist = new Comparable[a.length];
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // 对lo到hi之间的数据进行分组
        int mid = lo + (hi - lo) / 2;

//        分别对每一组数据进行排序
        sort(a, lo, mid);
        sort(a, mid + 1, hi);

//        再把两个组中的数据进行排序

    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
//        定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;

//        遍历，移动p1指针和p2指针，比较对应索引处的值，找出小的那个，放到辅助数组对应的索引处
        while (p1 <= mid && p2 <= hi) {
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }

        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }

        while (p2 <= hi) {
            assist[i++] = a[p2++];
        }

        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }
    }
}
