package com.csk.ds.sorting.problems;

import static com.csk.ds.sorting.problems.SortArray012.printArray;

class MergeTwoSortedArrays {

    static int[] merge(int[] a, int[] b) {
        int la = a.length;
        int lb = b.length;

        int[] c = new int[la+lb];

        int i=0;
        int j=0;
        int k=0;
        while (i < la && j < lb) {

            if (a[i] < b[j]) {
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }

        while (i < la) {
            c[k++] = a[i++];
        }

        while (j < lb) {
            c[k++] = b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = new int[] {10, 15, 20, 40};
        int[] b = new int[] {5, 6, 6, 10, 15};

        int[] c = MergeTwoSortedArrays.merge(a, b);

        printArray(c);
    }
}
