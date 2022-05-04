package cn.itcast.algorithm.test;

import cn.itcast.algorithm.graph.DepthFirstSearch;
import cn.itcast.algorithm.graph.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traffic_Project_Test2 {

    public static void main(String[] args) throws Exception{

        //构建一个缓冲读取流BufferedReader

        BufferedReader br = new BufferedReader(new InputStreamReader(Traffic_Project_Test2.class.getClassLoader().getResourceAsStream("traffic_project.txt")));

        //读取第一行数据20
        int totalNumber = Integer.parseInt(br.readLine());

        //构建一个Graph对象
        Graph G = new Graph(totalNumber);

        //读取第二行数据7
        int roadNumber = Integer.parseInt(br.readLine());
        //循环读取有限次(7)，读取已经修建好的道路
        for (int i = 1;i<=roadNumber;i++){
            String road = br.readLine();//"0 1"
            String[] str = road.split(" ");
            int v = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            //调用图的addEdge方法，把边添加到图中，表示已经修建好的道路

            G.addEdge(v,w);

        }

        //构建一个深度优先搜索对象，起点设置为顶点9
        DepthFirstSearch search = new DepthFirstSearch(G, 9);

        //调用marked方法，判断8顶点和10顶点是否与起点9相通
        System.out.println("顶点8和顶点9是否相通："+search.marked(8));
        System.out.println("顶点10和顶点9是否相通："+search.marked(10));

    }
}
