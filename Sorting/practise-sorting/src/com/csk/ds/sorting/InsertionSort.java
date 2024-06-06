package com.csk.ds.sorting;

import static com.csk.ds.sorting.BubbleSort.printArray;

class InsertionSort {

    static void sort(int[] array) {

        int len = array.length;

        for (int i=1; i < len; i++) {

            int key = array[i];
            int j;
            for (j=i-1; j >=0 && array[j] > key; j--) {

                array[j+1] = array[j];
            }

            array[j+1] = key;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {9, 5, 2, 4, 6, 8};

        InsertionSort.sort(array);

        printArray(array);
    }
}
