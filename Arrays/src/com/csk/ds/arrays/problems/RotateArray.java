package com.csk.ds.arrays.problems;

import java.util.Arrays;

class RotateArray {

    static void rotateArray(int[] arr, int k) {

        for (int i=0; i < k; i++) {
            int key = arr[0];
            for (int j = 1; j < arr.length; j++) {

                arr[j-1] = arr[j];
            }
            arr[arr.length -1] = key;
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{5, 8, 10, 12, 15};

        rotateArray(arr, 2);

        Arrays.stream(arr).forEach(el -> System.out.print(el + ", "));
    }
}
