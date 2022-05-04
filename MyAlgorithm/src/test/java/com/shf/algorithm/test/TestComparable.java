package com.shf.algorithm.test;

import com.shf.algorithm.sort.Student;
import org.testng.annotations.Test;

public class TestComparable {
    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if (result>=0){
            return c1;
        } else {
            return c2;
        }
    }

    @Test
    public void test1(){
        Student s1 = new Student("张三", 13);
        Student s2 = new Student("李四", 20);

        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }
}
