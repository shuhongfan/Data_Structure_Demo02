package com.shf.algorithm.test.tree;

import com.shf.algorithm.linear.Queue;
import com.shf.algorithm.tree.BinaryTree;
import org.testng.annotations.Test;

public class BinaryTreeErgodicTest {
    @Test
    public void test1(){
//        创建树对象
        BinaryTree<String, String> bt = new BinaryTree<>();
//        往树中添加数据
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");
//        遍历
        Queue<String> keys = bt.preErgodic();
        for (String key : keys) {
            String value = bt.get(key);
            System.out.println(key+"---------------"+value);
        }
    }

    @Test
    public void test2(){
//        创建树对象
        BinaryTree<String, String> bt = new BinaryTree<>();
//        往树中添加数据
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");
//        遍历
        Queue<String> keys = bt.midErgodic();
        for (String key : keys) {
            String value = bt.get(key);
            System.out.println(key+"---------------"+value);
        }
    }

    /**
     * 测试层序遍历
     */
    @Test
    public void test3(){
//        创建树对象
        BinaryTree<String, String> bt = new BinaryTree<>();

//        往树中添加数据
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");

//        遍历
        Queue<String> keys = bt.afterErgodic();
        for (String key : keys) {
            String value = bt.get(key);
            System.out.println(key+"---------------"+value);
        }
    }

    @Test
    public void test4(){
//        创建树对象
        BinaryTree<String, String> bt = new BinaryTree<>();

//        往树中添加数据
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");

//        遍历
        int maxDepth = bt.maxDepth();
        System.out.println(maxDepth);
    }
}
