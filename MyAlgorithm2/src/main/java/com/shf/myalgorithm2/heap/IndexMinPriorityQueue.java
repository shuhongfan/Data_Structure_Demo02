package com.shf.myalgorithm2.heap;

public class IndexMinPriorityQueue<T extends Comparable<T>>{
    private T[] items;
    private int[] pq;
    private int[] qp;
    private int N;

    public IndexMinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.pq = new int[capacity + 1];
        this.pq = new int[capacity + 1];
        this.N = 0;

        for (int i = 0; i < qp.length; i++) {
            qp[i] = -1;
        }
    }

    public int size() {
        return N;
    }

    public boolean less(int i, int j) {
        return items[pq[i]].compareTo(items[pq[j]]) < 0;
    }

    private void exch(int i, int j) {
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;

        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    public int minIndex() {
        return pq[1];
    }

    public void insert(int i, T t) {
        if (contins(i)) {
            return;
        }
        N++;
        items[i] = t;
        pq[N] = i;
        qp[i] = N;

        swim(N);
    }

    public int delMin() {
        int minIndex = pq[1];

        exch(1, N);
        qp[pq[N]] = -1;
        pq[N] = -1;
        items[pq[N]] = null;
        N--;
        sink(1);

        return minIndex;
    }

    public void delete(int i) {
        int k = pq[i];
        exch(k, N);
        qp[pq[N]] = -1;
        pq[N] = -1;
        items[k] = null;
        N--;
        sink(k);
        swim(k);
    }

    public void changeItem(int i, T t) {
        items[i] = t;
        int k = qp[i];
        sink(k);
        swim(k);
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int min;
            if (2 * k + 1 <= N) {
                if (less(2 * k, 2 * k + 1)) {
                    min = 2 * k;
                } else {
                    min = 2 * k + 1;
                }
            } else {
                min = 2 * k;
            }

            if (less(k, min)) {
                break;
            }

            exch(k, min);
            k = min;
        }
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k, k / 2)) {
                exch(k, k / 2);
            }
            k = k / 2;
        }
    }

    private boolean contins(int k) {
        return qp[k] != -1;
    }

    public static void main(String[] args) {
        IndexMinPriorityQueue<String> queue = new IndexMinPriorityQueue<>(10);

        queue.insert(0,"A");
        queue.insert(1,"C");
        queue.insert(2,"F");

    }
}
