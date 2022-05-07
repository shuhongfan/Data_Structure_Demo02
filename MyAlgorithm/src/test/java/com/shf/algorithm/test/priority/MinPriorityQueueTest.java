package com.shf.algorithm.test.priority;

import com.shf.algorithm.priority.MinPriorityQueue;
import org.testng.annotations.Test;

public class MinPriorityQueueTest {
    @Test
    public void test1(){
//        创建最小优先队列对象
        MinPriorityQueue<String> queue = new MinPriorityQueue<>(10);
//        往队列中存数据
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");
//        通过循环获取最小优先队列中的元素
        while (!queue.isEmpty()){
            String min = queue.deMin();
            System.out.print(min+" ");
        }
    }
}
