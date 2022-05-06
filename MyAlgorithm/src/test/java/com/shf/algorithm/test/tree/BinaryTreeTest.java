package com.shf.algorithm.test.tree;

import com.shf.algorithm.tree.BinaryTree;
import org.testng.annotations.Test;

public class BinaryTreeTest {

    @Test
    public void test1(){
//        创建二叉查找树
        BinaryTree<Integer, String> tree = new BinaryTree<>();

//        测试插入
        tree.put(1,"张三");
        tree.put(3,"李四");
        tree.put(2,"王五");
        System.out.println("插入完毕后元素的个数："+tree.size());

//        测试获取
        System.out.println("键2对应的元素是："+tree.get(2));

//        测试删除
        tree.delete(2);
        System.out.println("删除后的元素个数："+tree.size());
        System.out.println("删除后键2对应的元素是："+tree.get(2));
    }
}
