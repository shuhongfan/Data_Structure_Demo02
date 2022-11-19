package com.shf.myalgorithm2.linear;

import java.util.Stack;

public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "上海(长安)())";
        boolean match = isMatch(str);
        System.out.println(str+"中的括号是否匹配："+match);
    }

    private static boolean isMatch(String str) {
        Stack<String> chars = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String currChar = str.charAt(i)+" ";

            if (currChar.equals("(")) {
                chars.push(currChar);
            } else if (currChar.equals(")")) {
                String pop = chars.pop();
                if (pop == null) {
                    return false;
                }
            }
        }
        if (chars.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
