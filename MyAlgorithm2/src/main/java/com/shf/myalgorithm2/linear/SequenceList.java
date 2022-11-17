package com.shf.myalgorithm2.linear;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
//    存储元素的数组
    private T[] eles;

//    记录当前顺序表中的元素个数
    private int N;

//    构造方法
    public SequenceList(int capacity) {
//        初始化数组
        this.eles = (T[]) new Object[capacity];
        this.N = 0;
    }

    public void clear() {
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public T get(int i) {
        return eles[i];
    }

    public void insert(T t) {
        if (N == eles.length) {
            resize(2*eles.length);
        }
        eles[N++] = t;
    }

    public void insert(int i, T t) {
        if (N == eles.length) {
            resize(2*eles.length);
        }

        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        eles[i] = t;
        N++;
    }

    public T remove(int i) {
        T current = eles[i];
        for (int index = i; index < N-1; index++) {
            eles[index] = eles[index + 1];
        }
        N--;

        if (N < eles.length / 4) {
            resize(eles.length / 2);
        }
        return current;
    }

    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    private int length() {
        return N;
    }

    public static void main(String[] args) {
        SequenceList<String> s1 = new SequenceList<String>(3);
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("艾迪");
        s1.insert(1, "詹姆斯");

        for (String s : s1) {
            System.out.println(s);
        }

//        String getResult = s1.get(1);
//        System.out.println(getResult);
//
//        String removeResult = s1.remove(0);
//        System.out.println(removeResult);
//
//        s1.clear();
//        System.out.println(s1.length());
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private int cursor;

        public SIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < N;
        }

        @Override
        public Object next() {
            return eles[cursor++];
        }
    }

    public void resize(int newSize) {
        T[] temp = eles;
        eles = (T[]) new Object[newSize];
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }
    }

}
