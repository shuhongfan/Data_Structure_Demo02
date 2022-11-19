package com.shf.myalgorithm2.symbol;

public class SymbolTable<Key,Value>{
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

    public SymbolTable() {
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public int size() {
        return N;
    }

    public void put(Key key, Value value) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
            if (n.key.equals(key)) {
                n.value = value;
                return;
            }
        }

        Node newNode = new Node(key, value, null);
        Node oldFirst = head.next;
        newNode.next = oldFirst;
        head.next = newNode;

        N++;
    }

    public void delete(Key key) {
        Node n = head;
        while (n.next != null) {
            if (n.next.key.equals(key)) {
                n.next = n.next.next;
                N--;
                return;
            }

            n = n.next;
        }
    }

    public Value get(Key key) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
            if (n.key.equals(key)) {
                return n.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();

        symbolTable.put(1,"乔峰");
        symbolTable.put(2,"虚竹");
        symbolTable.put(3,"段誉");

        System.out.println("插入完毕后，元素的个数为：" + symbolTable.size());

        symbolTable.put(2, "慕容复");
        System.out.println("替换完毕后的元素个数为：" + symbolTable.size());

        System.out.println("替换完毕后，键2对应的值为："+symbolTable.get(2));

        symbolTable.delete(2);
        System.out.println("删除完毕后，元素的个数为："+symbolTable.size());
    }
}
