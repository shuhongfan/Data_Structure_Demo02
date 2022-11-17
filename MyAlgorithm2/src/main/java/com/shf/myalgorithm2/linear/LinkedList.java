package com.shf.myalgorithm2.linear;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    private Node head;
    private int N;

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator {
        private Node n;

        public LIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }


    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public void clear() {
        head.next = null;
        this.N = 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    public void insert(T t) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }

        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }

    public void insert(int i, T t) {
//        找到i位置的前一个节点
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }

//        找到i位置的节点
        Node curr = pre.next;
//        创建新节点，并且新节点需要指向原来i位置的节点
        Node newNode = new Node(t, curr);
//        原来i位置的前一个节点指向新节点即可
        pre.next = newNode;
//        元素的个数+1
        N++;
    }

    public T remove(int i) {
//        找到i位置的前一个节点
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }

//        找到i位置的节点
        Node curr = pre.next;
//        找到i位置的下一个节点
        Node nextNode = curr.next;
//        前一个节点指向下一个节点
        pre.next = nextNode;
//        元素-1
        N--;
        return curr.item;
    }

    public int indexOf(T t) {
        Node n = head;

        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList<String> s1 = new LinkedList<>();
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("艾迪");
        s1.insert(1, "詹姆斯");

        for (String s : s1) {
            System.out.println(s);
        }
    }
}
