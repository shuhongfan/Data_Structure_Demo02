package com.shf.algorithm.test.tree;

import com.shf.algorithm.tree.RedBlackTree;
import org.testng.annotations.Test;

public class RedBlackTreeTest {
    @Test
    public void test1(){
        RedBlackTree<String, String> tree = new RedBlackTree<>();

        tree.put("1", "张三");
        tree.put("2", "李四");
        tree.put("3", "王五");

        for (int i = 1; i <= 3; i++) {
            System.out.println(tree.get(String.valueOf(i)));
        }
    }
}
