package com.csk.ds.searching.problems;

import com.csk.ds.searching.BinarySearch;

public class FindElemInSortedRotatedArray {

    static boolean search(int[] arr, int n, int x) {

        int pivotIndex = PivotInSortedArray.findPivot(arr, 0, n-1);

        boolean found = BinarySearch.searchRecursive(arr, 0, pivotIndex, x);

        if (!found) {

            return BinarySearch.searchRecursive(arr, pivotIndex+1, n-1, x);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {10, 20, 40, 50, 6, 7, 8};

        boolean found = FindElemInSortedRotatedArray.search(arr, arr.length-1, 50);

        System.out.println(found);

        int[] arr1 = new int[] {10, 20, 1, 2, 3, 4, 5};

        found = FindElemInSortedRotatedArray.search(arr, arr.length-1, 50);

        System.out.println(found);
    }
}
