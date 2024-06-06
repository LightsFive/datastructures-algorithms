package com.csk.ds.arrays.problems;

public class MaxOccuredElemInRange {

    static int findMaxOccuringElement(int[] arr1, int[] arr2, int n) {

        int arr[] = new int[1000];

        for (int i=0; i < n; i++) {

            arr[arr1[i]]++;
            arr[arr2[i] + 1]--;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i=1; i < arr.length; i++) {

            arr[i] += arr[i-1];

            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }


        }

        //Arrays.stream(arr).forEach(System.out::print);

        return maxIndex;

    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{3, 5, 7};

        System.out.println(findMaxOccuringElement(arr1, arr2, 3));
    }
}
