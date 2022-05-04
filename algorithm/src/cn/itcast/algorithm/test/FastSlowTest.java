package cn.itcast.algorithm.test;

public class FastSlowTest {

    public static void main(String[] args) throws Exception {
        //创建结点
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

        //查找中间值
        String mid = getMid(first);
        System.out.println("中间值为："+mid);
    }

    /**
     * @param first 链表的首结点
     * @return 链表的中间结点的值
     */
    public static String getMid(Node<String> first) {
        //定义两个指针
        Node<String> fast = first;
        Node<String> slow = first;
        //使用两个指针遍历链表，当快指针指向的结点没有下一个结点了，就可以结束了，结束之后，慢指针指向的结点就是中间值
        while(fast!=null &&fast.next!=null){
            //变化fast的值和slow的值
            fast = fast.next.next;
            slow=slow.next;
        }

        return slow.item;
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
