package com.shf.algorithm.test.graph;

import com.shf.algorithm.graph.DepthFirstSearch;
import com.shf.algorithm.graph.Graph;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficProjectTest {
    @Test
    public void test1() throws IOException {
//        构建一个缓冲区读取BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(TrafficProjectTest.class.getClassLoader().getResourceAsStream("traffic_project.txt")));

//        读取第一行数据20
        int totalNumber = Integer.parseInt(br.readLine());

//        构建一个Graph对象
        Graph G = new Graph(totalNumber);

//        读取第二行数据
        int roadNumber = Integer.parseInt(br.readLine());

//        循环读取有限次 7次，读取已经修建好的道路
        for (int i = 1; i <= roadNumber; i++) {
            String road = br.readLine();
            String[] str = road.split(" ");
            int v = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
//        调用图的addEdge方法，把边添加到图中，表示已经修建好的道路
            G.addEdge(v, w);
        }

//        构建一个深度优先搜索对象，起点设置为9
        DepthFirstSearch search = new DepthFirstSearch(G, 9);

//        调用marked方法,判断8顶点和10顶点是否与起点9相通
        System.out.println("顶点8和顶点9是否相通：" + search.marked(8));
        System.out.println("顶点10和顶点9是否相通：" + search.marked(10));
    }
}
