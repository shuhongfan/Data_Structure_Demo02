package cn.itcast.algorithm.symbol;

public class OrderSymbolTable<Key extends Comparable<Key>,Value> {
    //记录首结点
    private Node head;
    //记录符号表中元素的个数
    private int N;

    private class Node{
        //键
        public Key key;
        //值
        public Value value;
        //下一个结点
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

    //获取符号表中键值对的个数
    public int size(){
        return N;
    }

    //往符号表中插入键值对
    public void put(Key key,Value value){
        //定义两个Node变量，分别记录当前结点和当前结点的上一个结点

        Node curr = head.next;
        Node pre = head;
        while(curr!=null && key.compareTo(curr.key)>0){

            //变换当前结点和前一个结点即可
            pre = curr;
            curr = curr.next;
        }

        //如果当前结点curr的键和要插入的key一样，则替换
        if (curr!=null && key.compareTo(curr.key)==0){
            curr.value = value;
            return;
        }

        //如果当前结点curr的键和要插入的key不一样，把新的结点插入到curr之前
        Node newNode = new Node(key, value, curr);
        pre.next = newNode;

        //元素的个数+1；
        N++;

    }
    //删除符号表中键为key的键值对
    public void delete(Key key){
        //找到键为key的结点，把该结点从链表中删除

        Node n = head;
        while(n.next!=null){
            //判断n结点的下一个结点的键是否为key，如果是，就删除该结点
            if (n.next.key.equals(key)){
                n.next = n.next.next;
                N--;
                return;
            }


            //变换n
            n = n.next;
        }
    }

    //从符号表中获取key对应的值
    public Value get(Key key){
        //找到键为key的结点
        Node n = head;
        while(n.next!=null){
            //变换n
            n = n.next;
            if (n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }


}