package cn.itcast.algorithm.test;

import cn.itcast.algorithm.linear.SequenceList;

public class SequenceListTest2 {

    public static void main(String[] args) {
        SequenceList<String> sl = new SequenceList<>(3);
        sl.insert("张三");
        sl.insert("李四");
        sl.insert("王五");
        sl.insert("赵六");
    }
}
