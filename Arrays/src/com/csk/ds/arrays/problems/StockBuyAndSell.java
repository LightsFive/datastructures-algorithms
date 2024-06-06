package com.csk.ds.arrays.problems;

import java.util.ArrayList;
import java.util.List;

class StockBuyAndSell {

    static int maxProfit(int[] arr, int n) {

        List<Integer> localMinima = new ArrayList<>();
        List<Integer> localMaxima = new ArrayList<>();

        if (n == 0 || n == 1) {
            return -1;
        }

        if (arr[0] < arr[1]) {
            localMinima.add(arr[0]);
        }

        for (int i=1; i < n-1; i++) {

            if (arr[i-1] > arr[i] && arr[i] < arr[i+1]) {
                localMinima.add(arr[i]);
            }
            else if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                localMaxima.add(arr[i]);
            }
        }

        if (arr[n-1] > arr[n-2]) {
            localMaxima.add(arr[n-1]);
        }

        int maxProfit = 0;

        for (int i=0; i < localMaxima.size(); i++) {

            maxProfit += (localMaxima.get(i) - localMinima.get(i));
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1, 5, 3, 8, 12};

        System.out.println("MaxProfit = " + maxProfit(arr, arr.length));

        int[] arr1 = new int[] {1, 5, 3, 8, 12, 20};

        System.out.println("MaxProfit = " + maxProfit(arr1, arr1.length));
    }
}
