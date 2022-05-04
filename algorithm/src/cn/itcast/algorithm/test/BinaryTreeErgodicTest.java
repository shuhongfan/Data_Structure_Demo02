package cn.itcast.algorithm.test;

import cn.itcast.algorithm.linear.Queue;
import cn.itcast.algorithm.tree.BinaryTree;

public class BinaryTreeErgodicTest {

    /*//测试前序遍历
    public static void main(String[] args) {
        //创建树对象
        BinaryTree<String, String> tree = new BinaryTree<>();
        //往树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

        //遍历
        Queue<String> keys = tree.preErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"----"+value);
        }

    }*/

    //测试中序遍历
   /* public static void main(String[] args) {
        //创建树对象
        BinaryTree<String, String> tree = new BinaryTree<>();
        //往树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

        //遍历
        Queue<String> keys = tree.midErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"----"+value);
        }

    }*/

    //测试后序遍历
    /*public static void main(String[] args) {
        //创建树对象
        BinaryTree<String, String> tree = new BinaryTree<>();
        //往树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

        //遍历
        Queue<String> keys = tree.afterErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"----"+value);
        }

    }*/

    //测试层序遍历
    public static void main(String[] args) {
        //创建树对象
        BinaryTree<String, String> tree = new BinaryTree<>();
        //往树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

        //遍历
        Queue<String> keys = tree.layerErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"----"+value);
        }

    }
}
