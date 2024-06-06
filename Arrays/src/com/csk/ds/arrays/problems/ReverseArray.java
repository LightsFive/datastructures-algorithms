package com.csk.ds.arrays.problems;

import java.util.Arrays;

class ReverseArray {

    static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};

        reverse(arr);
        reverse(arr1);

        Arrays.stream(arr).forEach(System.out::print);

        System.out.println("------------");
        Arrays.stream(arr1).forEach(System.out::print);
    }
}
