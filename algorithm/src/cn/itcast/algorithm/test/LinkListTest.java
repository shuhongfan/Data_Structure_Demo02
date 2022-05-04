package cn.itcast.algorithm.test;

import cn.itcast.algorithm.linear.LinkList;
import cn.itcast.algorithm.linear.SequenceList;


public class LinkListTest {

    public static void main(String[] args) {
        //创建顺序表对象
        LinkList<String> sl = new LinkList<>();
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(1,"詹姆斯");

        for (String s : sl) {
            System.out.println(s);
        }

        System.out.println("------------------------------------------");

        //测试获取
        String getResult = sl.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是："+removeResult);
        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数为:"+sl.length());
    }
}
