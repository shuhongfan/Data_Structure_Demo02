package com.shf.algorithm.test.linear;

import com.shf.algorithm.linear.LinkList;
import com.shf.algorithm.linear.SequenceList;
import org.testng.annotations.Test;

public class LinkListTest {
    @Test
    public void test1(){
        LinkList<String> s1 = new LinkList<>();
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert("詹姆斯");

        for (String s : s1) {
            System.out.println(s);
        }
        System.out.println("======================================");

        String get1 = s1.get(1);
        System.out.println("get1="+get1);

        String remove = s1.remove(0);
        System.out.println("remove="+remove);

        s1.clear();
        System.out.println("length="+s1.length());
    }

    @Test
    public void test2(){
        LinkList<String> s1 = new LinkList<>();
        s1.insert("张三");
        s1.insert("李四");
        s1.insert("王五");
        s1.insert("赵六");

        for (String s : s1) {
            System.out.println(s);
        }
    }

    @Test
    public void test3(){
        LinkList<String> s1 = new LinkList<>();
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert("詹姆斯");

        for (String s : s1) {
            System.out.println(s);
        }
        System.out.println("======================================");

       s1.reverse();

        for (String s : s1) {
            System.out.println(s);
        }
    }
}
