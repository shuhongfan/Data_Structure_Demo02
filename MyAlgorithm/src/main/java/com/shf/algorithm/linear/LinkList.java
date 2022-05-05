package com.shf.algorithm.linear;

import org.w3c.dom.Node;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
    //    记录头结点
    private Node head;
    //    记录链表的长度
    private int N;

    //    节点类
    private class Node {
        //        存储数据
        T item;
        //        下一个节点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
//        初始化头结点
        head = new Node(null, null);
//        初始化元素个数
        N = 0;
    }

    //    清空链表
    public void clear() {
//        断开指向
        head.next = null;
//        重置元素个数
        N = 0;
    }

    //    获取链表的长度
    public int length() {
        return N;
    }

    //    判断链表是否为空
    public boolean isEmpty() {
        return N == 0;
    }

    //    获取指定位置i处的元素
    public T get(int i) {
//        通过循环，从头结点开始往后找，依次找i次，就可以找到对应的元素
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    //    向链表中添加元素t
    public void insert(T t) {
//        找到当前最后一个节点
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }

//        创建新节点，保存元素t
        Node newNode = new Node(t, null);
//        让当前最后一个节点指向新节点
        n.next = newNode;
//        元素的个数+1
        N++;
    }

    //    指向指定位置i处，添加元素t
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
//        元素个数+1
        N++;
    }

    //    删除指定位置i处的元素，并返回被删除的元素
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
        pre.next=nextNode;
//        元素个数-1
        N--;
        return curr.item;
    }

    //    查找元素t在链表中第一次出现的位置
    public int indexOf(T t) {
//        从头结点开始，一次找到每一个节点，取出item，和t比较，如果相同就找到了
        for (int i = 0; i < N; i++) {
            if (head.next==t){
                return i;
            }
        }
        return -1;
    }

//    遍历
    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{
        private LinkList.Node n;

        public LIterator(){
            this.n=head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }

//    用来翻转整个链表
    public void reverse(){
//        判断当前链表是否为空链表，如果是空链表，则结束运行
//        如果不是，调用reverse方法进行翻转
        if (isEmpty()){
            return;
        }
        reverse(head.next);
    }
    public Node reverse(Node curr){
//        如果是最后一个节点
        if (curr.next==null){
            head.next=curr;
            return curr;
        }
//        递归的反转当前节点curr的下一个节点，返回值就是链表反转后，当前节点的上一个节点
        Node pre = reverse(curr.next); // 递归
//        让返回的节点的下一个节点变为当前节点curr
        pre.next=curr;
//        把当前节点的下一个节点变为null
        curr.next=null;
        return curr;
    }
}
