package com.shf.algorithm.test.priority;

import com.shf.algorithm.priority.MaxPriorityQueue;
import org.testng.annotations.Test;

public class MaxPriorityQueueTest {
    @Test
    public void test1(){
//        创建优先队列
        MaxPriorityQueue<String> queue = new MaxPriorityQueue<>(10);

        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");
        queue.insert("F");
        queue.insert("G");

        while (!queue.isEmpty()){
            String max = queue.delMax();
            System.out.print(max+" ");
        }
    }
}
