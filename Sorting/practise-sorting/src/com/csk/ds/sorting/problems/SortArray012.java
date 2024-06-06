package com.csk.ds.sorting.problems;

class SortArray012 {

    static void sort(int[] array) {

        int low = 0;
        int mid = 0;
        int high = array.length-1;

        while (mid < high) {

            switch (array[mid]) {
                case 0: {
                    swap(array, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(array, high, mid);
                    high--;
                    break;
                }
            }
        }
    }

    static void sort01(int[] array) {

        int low = 0;
        int high = 0;

        while (high < array.length) {

            switch (array[high]) {
                case 0: {
                    swap(array, low, high);
                    low++;
                    high++;
                    break;
                }
                case 1: {
                    high++;
                    break;
                }
            }
        }
    }

    private static void swap(int[] x, int a, int b) {
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    static void printArray(int[] array) {

        for (int i=0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {1, 1, 1, 0, 1, 0, 2, 1, 0};
        SortArray012.sort(array);
        printArray(array);

        System.out.println("Another Algo.....");

        int[] array01 = new int[] {1, 0, 1, 0, 1};
        SortArray012.sort01(array01);
        printArray(array01);
    }
}
