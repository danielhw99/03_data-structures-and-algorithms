package com.lhw.section03.stack;

import java.util.Stack;

public class Practice1 {

    public String solution(String input) {
        //정답
        Stack<Character> stack = new Stack<>();
        for (char c: input.toCharArray()) {
            if (c=='(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else  {
            return "NO";
        }
    }

    //내 풀이
    public String mysol(String input) {
        ArrayStack stack = new ArrayStack();

        for (char c: input.toCharArray()) {
            if (c=='(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else if (stack.size() >= 1) {
            return "NO";
        }
        return "";
    }
}
