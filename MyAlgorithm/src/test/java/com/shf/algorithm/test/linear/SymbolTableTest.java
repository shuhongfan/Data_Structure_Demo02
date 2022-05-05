package com.shf.algorithm.test.linear;

import com.shf.algorithm.linear.SymbolTable;
import org.testng.annotations.Test;

public class SymbolTableTest {
    @Test
    public void test1(){
//        创建符号对象
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();

        symbolTable.put(1,"乔峰");
        symbolTable.put(2,"虚竹");
        symbolTable.put(3,"段誉");

        System.out.println("插入完毕后，元素的个数为："+symbolTable.size());

        for (String str : symbolTable) {
            System.out.println(str);
        }

        symbolTable.put(2,"莫荣芳");

        System.out.println("替换完毕后元素的个数为："+symbolTable.size());

//        测试get方法
        System.out.println("替换完毕后，键2对应的值为："+symbolTable.get(2));

        symbolTable.delete(2);
        System.out.println("删除完毕，元素的个数为："+symbolTable.size());
    }

}
