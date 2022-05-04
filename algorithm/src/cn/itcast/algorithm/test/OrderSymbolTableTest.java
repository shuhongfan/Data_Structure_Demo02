package cn.itcast.algorithm.test;

import cn.itcast.algorithm.symbol.OrderSymbolTable;

public class OrderSymbolTableTest {

    public static void main(String[] args) {
        //创建有序符号表对象
        OrderSymbolTable<Integer, String> table = new OrderSymbolTable<>();

        table.put(1,"张三");
        table.put(2,"李四");
        table.put(4,"赵六");
        table.put(7,"田七");

        table.put(3,"王五");

    }
}
