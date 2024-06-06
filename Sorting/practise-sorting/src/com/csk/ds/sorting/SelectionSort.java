package com.csk.ds.sorting;

import static com.csk.ds.sorting.BubbleSort.printArray;

class SelectionSort {

    static void sort(int[] array) {

        int length = array.length;

        for (int i=0; i < length-1; i++) {

            int maxIndex = 0;
            int j;
            for (j=0; j < length-i-1; j++) {

                if (array[maxIndex] < array[j+1]) {
                    maxIndex = j+1;
                }
            }

            int temp = array[j];
            array[j] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {9, 5, 2, 4, 6, 8};

        SelectionSort.sort(array);

        printArray(array);
    }


}
