package com.shf.algorithm.test.linear;

import com.shf.algorithm.linear.Stack;
import org.testng.annotations.Test;

public class StackTest {
    @Test
    public void test1(){
//        创建栈对象
        Stack<String> stack = new Stack<>();

//        测试压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for (String item : stack) {
            System.out.println(item);
        }

        String result = stack.pop();
        System.out.println("弹出的元素是："+result);

        System.out.println("栈的大小是："+stack.size());
    }
}
