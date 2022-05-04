package cn.itcast.algorithm.graph;

public class DepthFirstSearch {
    //索引代表顶点，值表示当前顶点是否已经被搜索
    private boolean[] marked;
    //记录有多少个顶点与s顶点相通
    private int count;

    //构造深度优先搜索对象，使用深度优先搜索找出G图中s顶点的所有相邻顶点
    public DepthFirstSearch(Graph G,int s){
        //初始化marked数组
        this.marked = new boolean[G.V()];
        //初始化跟顶点s相通的顶点的数量
        this.count=0;

        dfs(G,s);
    }

    //使用深度优先搜索找出G图中v顶点的所有相通顶点
    private void dfs(Graph G, int v){
        //把v顶点标识为已搜索
        marked[v] = true;

        for (Integer w : G.adj(v)) {
            //判断当前w顶点有没有被搜索过，如果没有被搜索过，则递归调用dfs方法进行深度搜索
            if (!marked[w]){
                dfs(G,w);
            }

        }

        //相通顶点数量+1
        count++;
    }

    //判断w顶点与s顶点是否相通
    public boolean marked(int w){
       return marked[w];
    }

    //获取与顶点s相通的所有顶点的总数
    public int count(){
        return count;
    }

}