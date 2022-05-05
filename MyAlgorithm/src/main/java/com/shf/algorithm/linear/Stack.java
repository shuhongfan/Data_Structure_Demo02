package com.shf.algorithm.linear;

import org.w3c.dom.Node;

import java.util.Iterator;

/**
 * 栈
 * @param <T>
 */
public class Stack<T> implements Iterable<T> {
    //    记录首节点
    private Node head;

    //    栈中元素的个数
    private int N;


    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Stack() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    //    判断当前栈中元素个数是否为0
    public boolean isEmpty() {
        return N == 0;
    }

    //    获取栈中元素的个数
    public int size() {
        return N;
    }

    //    把t元素压入栈
    public void push(T t) {
//        找到首节点指向的第一个节点
        Node oldFirst = head.next;
//        创建新节点
        Node newFirst = new Node(t, null);
//        让首节点指向新节点
        head.next = newFirst;
//        让新节点指向原来的第一个节点
        newFirst.next = oldFirst;
//        元素个数+1
        N++;
    }

    //    弹出栈顶元素
    public T pop() {
//        找到首节点指向的第一个节点
        Node oldFirst = head.next;
//        让首节点指向原来的第一个节点的下一个节点
        if (oldFirst == null) {
            return null;
        }
        head.next = oldFirst.next;
//        元素个数+1
        N--;
        return oldFirst.item;
    }


    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private Stack.Node n;

        public SIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
