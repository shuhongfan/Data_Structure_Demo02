package cn.itcast.algorithm.test;

import cn.itcast.algorithm.symbol.SymbolTable;

public class SymbolTableTest {
    public static void main(String[] args) {
        //创建符号表对象
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();

        //测试put方法（插入,替换）
        symbolTable.put(1,"乔峰");
        symbolTable.put(2,"虚竹");
        symbolTable.put(3,"段誉");

        System.out.println("插入完毕后，元素的个数为:"+symbolTable.size());

        symbolTable.put(2, "慕容复");
        System.out.println("替换完毕后的元素的个数为:"+symbolTable.size());

        //测试get方法
        System.out.println("替换完毕后，键2对应的值为:"+symbolTable.get(2));

        //测试删除方法
        symbolTable.delete(2);
        System.out.println("删除完毕后，元素的个数:"+symbolTable.size());


    }
}
