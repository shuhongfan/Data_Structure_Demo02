package cn.itcast.algorithm.graph;

public class Edge implements Comparable<Edge> {
    private final int v;//顶点一
    private final int w;//顶点二
    private final double weight;//当前边的权重

    //通过顶点v和w，以及权重weight值构造一个边对象
    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    //获取边的权重值
    public double weight(){
        return weight;
    }

    //获取边上的一个点
    public int either(){
        return v;
    }

    //获取边上除了顶点vertex外的另外一个顶点
    public int other(int vertex){
        if (vertex==v){
            return w;
        }else{
            return v;
        }
    }

    @Override
    public int compareTo(Edge that) {
        //使用一个遍历记录比较的结果
        int cmp;

        if (this.weight()>that.weight()){
            //如果当前边的权重值大，则让cmp=1；
            cmp = 1;
        }else if (this.weight()<that.weight()){
            //如果当前边的权重值小，则让cmp=-1；
            cmp=-1;
        }else{
            //如果当前边的权重值和that边的权重值一样大，则让cmp=0
            cmp = 0;
        }

        return cmp;
    }
}
