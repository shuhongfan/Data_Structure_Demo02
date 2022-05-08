package com.shf.algorithm.test.graph;

import com.shf.algorithm.graph.Digraph;
import com.shf.algorithm.graph.TopoLogical;
import com.shf.algorithm.linear.Stack;
import org.testng.annotations.Test;

public class TopoLogicalTest {
    @Test
    public void test1() {
//        准备有向图
        Digraph digraph = new Digraph(6);

        digraph.addEdge(0, 2);
        digraph.addEdge(0, 3);
        digraph.addEdge(2, 4);
        digraph.addEdge(3, 4);
        digraph.addEdge(4, 5);
        digraph.addEdge(1, 3);

//        通过TopoLogical对象堆有向图的顶点进行排序
        TopoLogical topoLogical = new TopoLogical(digraph);

//        获取顶点的线程排序进行打印
        Stack<Integer> order = topoLogical.order();
        for (Integer w : order) {
            System.out.println(w);
        }
    }
}
