package com.shf.algorithm.test.linear;

import com.shf.algorithm.linear.Queue;
import org.testng.annotations.Test;

public class QueueTest {
    @Test
    public void test1(){
//        创建队列对象
        Queue<String> q = new Queue<>();

//        测试队列的enqueue方法
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");

        for (String str : q) {
            System.out.println(str);
        }
        System.out.println("=============================");

        String result = q.dequeue();
        System.out.println("出队列的元素是："+result);
        System.out.println("剩余的元素个数是："+q.size());
    }

}
