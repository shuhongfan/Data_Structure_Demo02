package cn.itcast.algorithm.tree;

public class RedBlackTree<Key extends Comparable<Key>, Value> {
    //根节点
    private Node root;
    //记录树中元素的个数
    private int N;
    //红色链接
    private static final boolean RED = true;
    //黑色链接
    private static final boolean BLACK = false;


    //结点类
    private class Node {
        //存储键
        public Key key;
        //存储值
        private Value value;
        //记录左子结点
        public Node left;
        //记录右子结点
        public Node right;
        //由其父结点指向它的链接的颜色
        public boolean color;

        public Node(Key key, Value value, Node left, Node right, boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }


    //获取树中元素的个数
    public int size() {
        return N;
    }


    /**
     * 判断当前节点的父指向链接是否为红色
     *
     * @param x
     * @return
     */
    private boolean isRed(Node x) {
        if (x==null){
            return false;
        }
        return x.color==RED;
    }

    /**
     * 左旋转
     *
     * @param h
     * @return
     */
    private Node rotateLeft(Node h) {
        //找到h结点的右子结点x
        Node x = h.right;
        //找到x结点的左子结点，让x结点的左子结点称为h结点的右子结点
        h.right = x.left;
        //让h结点称为x结点的左子结点
        x.left = h;
        //让x结点的color属性变为h结点的color属性
        x.color = h.color;
        //让h结点的color属性变为RED
        h.color = RED;

        return x;
    }

    /**
     * 右旋
     *
     * @param h
     * @return
     */
    private Node rotateRight(Node h) {
        //找到h结点的左子结点 x
        Node x = h.left;
        //让x结点的右子结点成为h结点的左子结点
        h.left = x.right;
        //让h结点成为x结点的右子结点
        x.right = h;
        //让x结点的color属性变为h结点的color属性
        x.color = h.color;
        //让h结点的color属性为RED
        h.color = RED;

        return x;
    }

    /**
     * 颜色反转,相当于完成拆分4-节点
     *
     * @param h
     */
    private void flipColors(Node h) {
        //当前结点变为红色
        h.color = RED;
        //左子结点和右子结点变为黑色
        h.left.color=BLACK;
        h.right.color = BLACK;
    }

    /**
     * 在整个树上完成插入操作
     *
     * @param key
     * @param val
     */
    public void put(Key key, Value val) {
        root = put(root,key,val);
        //根结点的颜色总是黑色
        root.color = RED;
    }

    /**
     * 在指定树中，完成插入操作,并返回添加元素后新的树
     *
     * @param h
     * @param key
     * @param val
     */
    private Node put(Node h, Key key, Value val) {
        //判断h是否为空，如果为空则直接返回一个红色的结点就可以了
        if (h == null){
            //数量+1
            N++;
            return new Node(key,val,null,null,RED);
        }

        //比较h结点的键和key的大小
        int cmp = key.compareTo(h.key);
        if (cmp<0){
            //继续往左
            h.left = put(h.left,key,val);

        }else if (cmp>0){
            //继续往右
            h.right = put(h.right,key,val);

        }else{
            //发生值的替换
            h.value = val;
        }

        //进行左旋:当当前结点h的左子结点为黑色，右子结点为红色，需要左旋
        if (isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }

        //进行右旋：当当前结点h的左子结点和左子结点的左子结点都为红色，需要右旋
        if (isRed(h.left) && isRed(h.left.left)){
            rotateRight(h);
        }

        //颜色反转：当前结点的左子结点和右子结点都为红色时，需要颜色反转
        if (isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }



        return h;
    }

    //根据key，从树中找出对应的值
    public Value get(Key key) {
        return get(root,key);
    }

    //从指定的树x中，查找key对应的值
    public Value get(Node x, Key key) {
        if (x == null){
            return null;
        }

        //比较x结点的键和key的大小
        int cmp = key.compareTo(x.key);
        if (cmp<0){
            return get(x.left,key);
        }else if (cmp>0){
            return get(x.right,key);
        }else{
           return x.value;
        }

    }

}
