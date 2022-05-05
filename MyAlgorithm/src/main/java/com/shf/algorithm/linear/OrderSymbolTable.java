package com.shf.algorithm.linear;

import java.util.Iterator;

/**
 * 符号表
 * @param <Key>
 * @param <Value>
 */
public class OrderSymbolTable<Key extends Comparable<Key>,Value> implements Iterable<Value>{
//    记录首节点
    private Node head;

//    记录符号表中元素个数
    private int N;


    private class Node{
//        键
        public Key key;
//        值
        public Value value;
//        下一个节点
        public Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public OrderSymbolTable() {
        this.head = new Node(null,null,null);
        this.N=0;
    }

//    获取符号表中键值对的个数
    public int size(){
        return N;
    }

//    往符号表中插入键值对
    public void put(Key key,Value value){
//        定义两个Node变量，分别记录当前节点和当前的上一个节点
        Node curr = head.next;
        Node pre = head;
        while (curr!=null && key.compareTo(curr.key)>0){
//            变换当前节点和前一个节点即可
            pre = curr;
            curr = curr.next;
        }

//        如果当前节点curr的键和要插入的key一样
        if (curr!=null && key.compareTo(curr.key)==0){
            curr.value=value;
            return;
        }
//        如果当前节点curr的键和要插入的key不一样，把新的节点插入到curr之前
        Node newNode = new Node(key, value, curr);
        pre.next = newNode;

//        元素的个数+1
        N++;
    }

//    删除符号表中键为key的键值对
    public void delete(Key key){
//        找到键为key的节点，把该节点从链表中删除
        Node n = head;
        while (n.next!=null){
//            判断n节点的下一个节点的键是否为key，如果是，就删除该节点
            if (n.next.key.equals(key)){
                n.next=n.next.next;
                N--;
                return;
            }
//            变换n
            n=n.next;
        }
    }

//    从符号表中获取key对应的值
    public Value get(Key key){
//        找到键为key的节点
        Node n=head;
        while (n.next!=null){
//            变换n
            n = n.next;
            if (n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return new OIterator();
    }
    private class OIterator implements Iterator{
        private Node n = head;

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.value;
        }
    }
}
