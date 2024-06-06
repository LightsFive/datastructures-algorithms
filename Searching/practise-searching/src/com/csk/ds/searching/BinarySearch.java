package com.csk.ds.searching;

public class BinarySearch {

    public static boolean searchRecursive(int[] array, int l, int h, int x) {

        if ( l < h ) {

            int mid = l + (h-l)/2;

            if (x == array[mid]) {
                return true;
            }

            else if (x > array[mid]) {
                return searchRecursive(array, mid+1, h, x);
            }

            else {
                return searchRecursive(array, l, mid-1, x);
            }
        }
        return false;
    }

    static boolean searchIterative(int[] array, int l, int h, int x) {

        while (l < h) {

            int mid = l + (h-l)/2;
            if (x == array[mid]) {
                return true;
            }

            else if (x > array[mid]) {
                l = mid + 1;
            }

            else {
                h = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 35, 40, 50, 60, 70, 86, 99};

        System.out.println(searchRecursive(array, 0, array.length-1, 88));
        System.out.println(searchIterative(array, 0, array.length-1, 50));
    }
}
