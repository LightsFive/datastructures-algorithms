package com.csk.ds.arrays.problems;

class RainWater {

    static int findWaterUnits(int[] arr, int n) {

        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i=0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            lmax[i] = max;
        }

        max = Integer.MIN_VALUE;

        for (int i=n-1; i >= 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
            }
            rmax[n-i-1] = max;
        }

        int sum = 0;

        for (int i=0; i < n; i++) {

            sum += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {6, 0, 1, 2, 5};

        System.out.println(findWaterUnits(arr, arr.length));

    }
}
