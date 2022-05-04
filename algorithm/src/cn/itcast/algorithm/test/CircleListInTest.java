package cn.itcast.algorithm.test;

public class CircleListInTest {
    public static void main(String[] args) throws Exception {
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> six = new Node<String>("ff", null);
        Node<String> seven = new Node<String>("gg", null);

        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        //产生环
        seven.next = third;

        //查找环的入口结点
        Node<String> entrance = getEntrance(first);
        System.out.println("first链表中环的入口结点元素为："+entrance.item);
    }

    /**
     * 查找有环链表中环的入口结点
     * @param first 链表首结点
     * @return 环的入口结点
     */
    public static Node getEntrance(Node<String> first) {
        //定义快慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        Node<String> temp = null;

        //遍历链表，先找到环(快慢指针相遇),准备一个临时指针，指向链表的首结点，继续遍历，直到慢指针和临时指针相遇，那么相遇时所指向的结点就是环的入口
        while(fast!=null && fast.next!=null){
            //变换快慢指针
            fast = fast.next.next;
            slow = slow.next;

            //判断快慢指针是否相遇
            if (fast.equals(slow)){
                temp = first;
                continue;
            }

            //让临时结点变换
            if (temp!=null){
                temp = temp.next;
                //判断临时指针是否和慢指针相遇
                if (temp.equals(slow)){
                    break;
                }
            }
        }

        return temp;
    }
    //结点类
    private static class Node<T> {
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
