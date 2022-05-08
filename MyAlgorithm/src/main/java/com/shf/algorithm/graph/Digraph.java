package com.shf.algorithm.graph;

import com.shf.algorithm.linear.Queue;

public class Digraph {
    //    顶点数目
    private final int V;
    //    边的数据
    private int E;
    //    邻接表
    private Queue<Integer>[] adj;

    public Digraph(int V) {
//        初始化顶点数量
        this.V = V;
//        初始化边的数量
        this.E = 0;
//        初始化邻接表
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }
    }

    //    获取顶点的数目
    public int V() {
        return V;
    }

    //    获取边的数目
    public int E() {
        return E;
    }

    //    向有向图中添加一条边
    public void addEdge(int v, int w) {
//        只需要让顶点w出现在顶点v的邻接表中，因为边是有方向的，最终，顶点v的邻接表中存储的相邻顶点的含义是：v->其他顶点
        adj[v].enqueue(w);
        E++;
    }

    //    获取由v指出的边所连接的所有顶点
    public Queue<Integer> adj(int v) {
        return adj[v];
    }

    //    该图的反向图
    private Digraph reverse() {
//        创建有向图对象
        Digraph r = new Digraph(V);

        for (int v = 0; v < V; v++) {
//            获取由该顶点v指出的所有边
            for (Integer w : adj[v]) {  // 原图中表示的是由定点v-->w的边
                r.addEdge(w, v); // w-->v
            }
        }

        return r;
    }
}
