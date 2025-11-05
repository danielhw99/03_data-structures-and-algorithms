package com.lhw.section03.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Practice2 {

    public int solution(String S) {
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        Stack<Character> stackAll = new Stack<>();

        for (char c : S.toCharArray()) {
            if  (c == '(') {
                stack.push(c);
                stackAll.push(c);
            } else if (!stack.isEmpty()) {
                if (stackAll.peek() == ')') {
                    cnt++;
                    stack.pop();
                    continue;
                }
                stackAll.push(c);
                stack.pop();
                cnt += stack.size();
            }
        }


        return cnt;
    }
}
