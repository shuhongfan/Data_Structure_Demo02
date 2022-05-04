package cn.itcast.algorithm.graph;

import cn.itcast.algorithm.linear.Stack;

public class DepthFirstPaths {
    //索引代表顶点，值表示当前顶点是否已经被搜索
    private boolean[] marked;
    //起点
    private int s;
    //索引代表顶点，值代表从起点s到当前顶点路径上的最后一个顶点
    private int[] edgeTo;

    //构造深度优先搜索对象，使用深度优先搜索找出G图中起点为s的所有路径
    public DepthFirstPaths(Graph G, int s){
        //初始化marked数组
        this.marked = new boolean[G.V()];
        //初始化起点
        this.s = s;
        //初始化edgeTo数组
        this.edgeTo = new int[G.V()];

        dfs(G,s);
    }

    //使用深度优先搜索找出G图中v顶点的所有相邻顶点
    private void dfs(Graph G, int v){
        //把v表示为已搜索
        marked[v] = true;

        //遍历顶点v的邻接表，拿到每一个相邻的顶点，继续递归搜索
        for (Integer w : G.adj(v)) {
            //如果顶点w没有被搜索，则继续递归搜索

            if (!marked[w]){
                edgeTo[w] = v;//到达顶点w的路径上的最后一个顶点是v
                dfs(G,w);
            }

        }
    }

    //判断w顶点与s顶点是否存在路径
    public boolean hasPathTo(int v){
        return marked[v];
    }

    //找出从起点s到顶点v的路径(就是该路径经过的顶点)
    public Stack<Integer> pathTo(int v){
        if (!hasPathTo(v)){
            return null;
        }

        //创建栈对象，保存路径中的所有顶点
        Stack<Integer> path = new Stack<>();

        //通过循环，从顶点v开始，一直往前找，到找到起点为止
        for (int x = v; x!=s;x = edgeTo[x]){
            path.push(x);
        }

        //把起点s放到栈中
        path.push(s);

        return path;
    }



}