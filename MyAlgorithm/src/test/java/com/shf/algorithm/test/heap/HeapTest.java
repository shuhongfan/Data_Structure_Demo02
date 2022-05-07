package com.shf.algorithm.test.heap;

import com.shf.algorithm.heap.Heap;
import org.testng.annotations.Test;

public class HeapTest {
    @Test
    public void test1(){
//        创建对象
        Heap<String> heap = new Heap<String>(10);
//        往堆中存入字符串数据
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
        heap.insert("E");
        heap.insert("F");
        heap.insert("G");

//        通过循环从堆中删除数据
        String result = null;
        while ((result=heap.delMax())!=null){
            System.out.println(result+"  ");
        }
    }
}
