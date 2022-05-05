package com.shf.algorithm.linear;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
//    存储元素的数组
    private T[] eles;

//    记录当前顺序表中的元素个数
    private int N;

//    构造方法
    public SequenceList(int capacity){
//        初始化数据
        eles= (T[]) new Object[capacity];
//        初始化长度
        N=0;
    }

//    将一个线性表置为空表
    public void clear(){
        this.N=0;
    }

//    判断当前线性表是否为空表
    public boolean isEmpty(){
        return this.N==0;
    }

//    获取线性表的长度
    public int length(){
        return N;
    }

//    获取指定位置的元素
    public T get(int i){
        return eles[i];
    }

//    向线性表中添加元素t
    public void insert(T t){
//        扩容
        if (N==eles.length){
            resize(2*eles.length);
        }
        eles[N++]=t;
    }

//    在i元素处插入元素t
    public void insert(int i,T t){
//        扩容
        if (N==eles.length){
            resize(2*eles.length);
        }
//        先把i索引处的元素及其后面的元素依次向后移动一位
        for (int index=N;index>i;index--){
            eles[index]=eles[index-1];
        }
//        再把t元素放到i索引处即可
        eles[i]=t;

        N++;
    }

//   删除指定位置i处的元素，返回该元素
    public T remove(int i){
//        记录索引i处的值
        T current = eles[i];
//        索引i后面元素依次向前移动一位即可
        for (int index=i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
//        元素个数减一
        N--;

//        缩容
        if (N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }

//    查找t元素第一次出现的位置
    public int indexOf(T t){
        for (int i=0;i<N;i++){
            if (eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据参数newSize，重置eles大小
     * @param newSize
     */
    public void resize(int newSize){
//        定义一个临时数据，指向原数组
        T[] temp = eles;
        eles= (T[]) new Object[newSize];
//        把原数组的数据拷贝到新数组即可
        for (int i = 0; i < N; i++) {
            eles[i]=temp[i];
        }
    }

    /**
     * 遍历
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private int cursor;

        public SIterator(){
            this.cursor=0;
        }

        @Override
        public boolean hasNext() {
            return cursor<N;
        }

        @Override
        public Object next() {
            return eles[cursor++];
        }
    }
}
