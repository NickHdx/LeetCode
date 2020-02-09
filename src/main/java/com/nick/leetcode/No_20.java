package com.nick.leetcode;

// https://leetcode.com/problems/valid-parentheses/

public class No_20 {
    public static void main(String[] args) {
        No_20 obj = new No_20();
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("(]"));
        System.out.println(obj.isValid("([)]"));
        System.out.println(obj.isValid("{[]}"));
        System.out.println(obj.isValid("{"));
        System.out.println(obj.isValid("]"));
    }

    public boolean isValid(String s) {
        FixedStack stack = new FixedStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    char c = stack.pop();
                    if (!((c == '{' && s.charAt(i) == '}')
                            ||(c == '[' && s.charAt(i) == ']')
                            || c == '(' && s.charAt(i) == ')')) {
                        return false;
                    }
                } else {
                    return  false;
                }
            }
        }
        return stack.isEmpty();
    }

    private class FixedStack {
        private char[] stack;
        private int size;

        FixedStack(int size) {
            stack = new char[size];
            this.size = 0;
        }

        boolean isEmpty() {
            return size <= 0;
        }

        char pop() {
            if (!isEmpty()) {
                return stack[--size];
            }
            throw new RuntimeException("Stack is empty.");
        }

        void push(char c) {
            stack[size++] = c;
        }
    }
}
