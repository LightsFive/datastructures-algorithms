package com.csk.ds.sorting;

import static com.csk.ds.sorting.BubbleSort.printArray;

public class MergeSorted {

    static void sort(int[] array, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;
            sort(array, left, mid);
            sort(array, mid+1, right);

            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {

        int l = mid - left + 1;
        int r = right - mid;

        int[] lArray = new int[l];
        int[] rArray = new int[r];

        for (int i=0; i < l; i++) {

            lArray[i] = array[i + left];
        }

        for (int i=0; i < r; i++) {

            rArray[i] = array[mid + 1 + i];
        }

        int i =0;
        int j=0;
        int k = left;
        while (i < l && j < r) {

            if (lArray[i] < rArray[j]) {

                array[k++] = lArray[i++];
            }
            else {
                array[k++] = rArray[j++];
            }

        }

        while (i < l) {
            array[k++] = lArray[i++];
        }

        while (j < r) {
            array[k++] = rArray[j++];
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {9, 5, 2, 4, 6, 8};

        MergeSorted.sort(array, 0, array.length-1);

        printArray(array);
    }
}
