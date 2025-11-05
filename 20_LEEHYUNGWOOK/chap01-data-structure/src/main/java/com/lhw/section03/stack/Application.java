package com.lhw.section03.stack;

public class Application {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.pop());
        int index = stack.search(1);
        System.out.println(index);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
