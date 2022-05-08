package com.shf.algorithm.graph;

public class Edge implements Comparable<Edge> {
    //    顶点1
    private final int v;
    //    顶点2
    private final int w;
    //    当前边的权重
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    //    获取边的权重值
    public double weight() {
        return weight;
    }

    //    获取边上的一个点
    public int either() {
        return v;
    }


    //    获取边上除了顶点vertex外的另一个顶点
    public int other(int vertex) {
        if (vertex == v) {
            return w;
        } else {
            return v;
        }
    }


    @Override
    public int compareTo(Edge that) {
//        使用一个变量记录比较的结果
        int cmp;
//        如果当前边的权重大，则让cmp=1
        if (this.weight() > that.weight()) {
            cmp = 1;
        } else if (this.weight() < that.weight()) {//        如果当前边的权重值小，则让cmp=-1
            cmp = -1;
        } else {//        如果当前边的权重值和that边的权重值一样大，则让cmp=0
            cmp = 0;
        }
        return cmp;
    }
}
