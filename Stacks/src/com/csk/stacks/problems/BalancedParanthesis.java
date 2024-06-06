package com.csk.stacks.problems;

import java.util.Stack;

class BalancedParanthesis {

    static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i=0; i < s.length(); i++) {

            if (s.charAt(i) == '[') {

                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == ']') {

                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "[[[]]]]";

        System.out.println(isBalanced(s));
    }
}
