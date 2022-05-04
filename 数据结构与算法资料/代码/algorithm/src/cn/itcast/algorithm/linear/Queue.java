package cn.itcast.algorithm.linear;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
    //记录首结点
    private Node head;
    //记录最后一个结点
    private Node last;
    //记录队列中元素的个数
    private int N;


    private class Node{
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public Queue() {
        this.head = new Node(null,null);
        this.last=null;
        this.N=0;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return N==0;
    }

    //返回队列中元素的个数
    public int size(){
        return N;
    }

    //向队列中插入元素t
    public void enqueue(T t){

        if (last==null){
            //当前尾结点last为null
            last= new Node(t,null);
            head.next=last;
        }else {
            //当前尾结点last不为null
            Node oldLast = last;
            last = new Node(t, null);
            oldLast.next=last;
        }

        //元素个数+1
        N++;
    }

    //从队列中拿出一个元素
    public T dequeue(){
        if (isEmpty()){
            return null;
        }

        Node oldFirst= head.next;
        head.next=oldFirst.next;
        N--;

        //因为出队列其实是在删除元素，因此如果队列中的元素被删除完了，需要重置last=null;

        if (isEmpty()){
            last=null;
        }
        return oldFirst.item;
    }


    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator{
        private Node n;

        public QIterator(){
            this.n=head;
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


}

