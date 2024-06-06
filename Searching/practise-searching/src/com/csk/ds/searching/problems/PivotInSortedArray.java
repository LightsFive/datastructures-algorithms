package com.csk.ds.searching.problems;

public class PivotInSortedArray {

    static int findPivot(int[] arr, int low, int high) {

        while (low < high) {

            int mid = low + (high - low)/2;

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if (arr[mid] < arr[0]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] arr = new int[] {10, 20, 40, 50, 6, 7, 8};

        int pivotIndex = findPivot(arr, 0, arr.length-1);
        int pivotElem = arr[pivotIndex];

        System.out.println("PivotIndex= " + pivotIndex + " PivotElement = " + pivotElem);

        int[] arr1 = new int[] {10, 20, 1, 2, 3, 4, 5};

        int pivotIndex1 = findPivot(arr1, 0, arr1.length-1);
        int pivotElem1 = arr[pivotIndex1];

        System.out.println("PivotIndex= " + pivotIndex1 + " PivotElement = " + pivotElem1);
    }
}
