package com.shf.algorithm.test.priority;

import com.shf.algorithm.priority.IndexMinPriorityQueue;
import org.testng.annotations.Test;

public class IndexMinPriorityQueueTest {
    @Test
    public void test1(){
//        创建最小优先队列对象
        IndexMinPriorityQueue<String> queue = new IndexMinPriorityQueue<>(10);
//        在队列中添加元素
        queue.insert(0,"A");
        queue.insert(1,"C");
        queue.insert(2,"F");

//        测试修改
        queue.changeItem(2,"B");
//        测试删除
        while (!queue.isEmpty()){
            int index = queue.delMin();
            System.out.print(index+" ");
        }
    }
}
