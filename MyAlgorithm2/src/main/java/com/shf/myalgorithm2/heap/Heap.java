package com.shf.myalgorithm2.heap;

public class Heap<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public Heap(int capacity) {
        this.items = (T[]) new Comparable[capacity+1];
        this.N = 0;
    }

    public boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    private void exch(int i, int j) {
        T item = items[i];
        items[i] = items[j];
        items[j] = item;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) {
                exch(k / 2, k);
            }
            k = k / 2;
        }
    }

    public T delMax() {
        T max = items[1];

//        交换索引1处的元素和最大索引处的元素，让完全二叉树中最右侧的元素变为临时根节点
        exch(1, N);

//        最大索引处的元素删除掉
        items[N] = null;

//        元素个数-1
        N--;

//        通过下沉调整堆，让堆重新有序
        sink(1);
        return max;
    }

    private void sink(int k) {
//        通过循环不断的对比当前k节点和其左子节点2*k以及后
        while (2 * k <= N) {
            int max;
            if (2 * k + 1 <= N) {
                if (less(2 * k, 2 * k + 1)) {
                    max = 2 * k + 1;
                } else {
                    max = 2 * k;
                }
            } else {
                max = 2 * k;
            }

            if (!less(k, max)) {
                break;
            }

            exch(k,max);
        }
    }


    public static void main(String[] args) {
        Heap<String> heap = new Heap<String>(10);
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
        heap.insert("E");
        heap.insert("F");
        heap.insert("G");

        String result = null;
        while ((result = heap.delMax() )!= null) {
            System.out.println(result);
        }
    }
}
