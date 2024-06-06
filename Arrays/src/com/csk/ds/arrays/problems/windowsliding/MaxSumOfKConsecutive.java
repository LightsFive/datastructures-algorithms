package com.csk.ds.arrays.problems.windowsliding;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class MaxSumOfKConsecutive {

    static int maxSumOfKConsecutiveElements(int[] arr, int n, int k) {

        int maxSum = 0;
        int currSum;

        for (int i=0; i < k; i++) {

            maxSum += arr[i];
        }

        currSum = maxSum;
        for (int i=k; i < n; i++) {

            currSum += arr[i] - arr[i-k] ;
            if (currSum > maxSum) {

                maxSum = currSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1, 8, 30, -5, 20, 7};

        System.out.println("MaxSum = " + maxSumOfKConsecutiveElements(arr, arr.length, 3));

        int[] arr1 = new int[] {5, -10, 6, 90, 3};

        System.out.println("MaxSum = " + maxSumOfKConsecutiveElements(arr1, arr1.length, 2));

        PriorityQueue<Integer> items = new PriorityQueue<>();
        items.add(5);
        items.add(4);
        items.add(3);
        items.add(2);
        items.add(1);

        items.forEach(System.out::println);



    }
}
