package cn.itcast.algorithm.test;

import cn.itcast.algorithm.tree.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        //创建二叉查找树对象
        BinaryTree<Integer, String> tree = new BinaryTree<>();

        //测试插入
        tree.put(1,"张三");
        tree.put(2,"李四");
        tree.put(3,"王五");
        System.out.println("插入完毕后元素的个数："+tree.size());

        //测试获取
        System.out.println("键2对应的元素是："+tree.get(2));

        //测试删除

        tree.delete(3);
        System.out.println("删除后的元素个数："+tree.size());
        System.out.println("删除后键3对应的元素:"+tree.get(3));


    }

}
