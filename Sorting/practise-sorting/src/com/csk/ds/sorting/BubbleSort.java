package com.csk.ds.sorting;

class BubbleSort {

    private static void sort(int[] array) {
        int len = array.length;

        for (int i=0; i < len-1; i++) {

            boolean swapped = false;

            for (int j=0; j < len-i-1; j++) {

                if (array[j] > array[j+1]) {
                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

            if (!swapped)
                break;
        }
    }

    static void printArray(int[] array) {

        for (int i=0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {9, 5, 2, 4, 6, 8};

        BubbleSort.sort(array);

        printArray(array);
    }
}
