package com.csk.ds.arrays.problems;

import java.util.Arrays;

class PushZeroesToEnd {

    static void pushZeroesToEnd(int[] arr, int n) {

        int count = 0;

        for (int i=0; i < n; i++) {

            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        pushZeroesToEnd(arr, arr.length);

        Arrays.stream(arr)
                .forEach(System.out::println);
    }
}
