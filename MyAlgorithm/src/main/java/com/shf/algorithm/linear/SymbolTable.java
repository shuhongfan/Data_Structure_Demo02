package com.shf.algorithm.linear;

import org.w3c.dom.Node;

import java.util.Iterator;

/**
 * 符号表
 * @param <Key>
 * @param <Value>
 */
public class SymbolTable<Key,Value> implements Iterable<Value>{
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

    public SymbolTable() {
        this.head = new Node(null,null,null);
        this.N=0;
    }

//    获取符号表中键值对的个数
    public int size(){
        return N;
    }

//    往符号表中插入键值对
    public void put(Key key,Value value){
//        符号表中已经存在了键为key的键值对，那么只需要找到该节点，替换值为value即可
        Node n = head;
        while (n.next!=null){
//            变换n
            n = n.next;
//            判断n节点存储的键是否为key，如果是，则替换n节点的值
            if (n.key.equals(key)){
                n.value=value;
                return;
            }
        }
//        如果符号表中不存在键位key的键值对，只要创建新的节点，
//        保存要插入键值对，把新节点插入到链表的头部，head.next=新节点即可
        Node newNode = new Node(key, value, null);
        Node oldFirst = head.next;
        newNode.next=oldFirst;
        head.next=newNode;
//        元素个数+1
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
    public Iterator<Value> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private SymbolTable.Node n = head;

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.value;
        }
    }
}
