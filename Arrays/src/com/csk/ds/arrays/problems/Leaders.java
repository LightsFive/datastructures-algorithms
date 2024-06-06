package com.csk.ds.arrays.problems;

import java.util.Stack;

class Leaders {

    static Stack<Integer> leaders(int[] arr, int n) {

        var stack = new Stack<Integer>();
        stack.push(arr[n-1]);
        int big = Integer.MIN_VALUE;
        for (int i= n -1; i > 0; i--) {

            if (arr[i-1] > arr[i] && arr[i-1] > big) {
                stack.push(arr[i-1]);
                big = arr[i-1];
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 35, 20, 15, 25, 3};

        var stack = leaders(arr, arr.length);

        while (stack.isEmpty() == false) {

            System.out.println(stack.pop());
        }
    }
}
