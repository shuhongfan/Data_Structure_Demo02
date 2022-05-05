package com.shf.algorithm.test.linear;

import com.shf.algorithm.linear.OrderSymbolTable;
import org.testng.annotations.Test;

public class OrderSymbolTableTest {
    @Test
    public void test1(){
        OrderSymbolTable<Integer, String> table = new OrderSymbolTable<>();

        table.put(1,"张三");
        table.put(2,"李四");
        table.put(7,"赵六");
        table.put(2,"田七");

        for (String str : table) {
            System.out.println(str);
        }
    }
}
