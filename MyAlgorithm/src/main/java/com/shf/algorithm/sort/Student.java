package com.shf.algorithm.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>{
    private String username;
    private int age;

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
