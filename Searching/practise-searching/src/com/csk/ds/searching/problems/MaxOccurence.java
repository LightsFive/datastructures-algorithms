package com.csk.ds.searching.problems;

class MaxOccurence {

    static int leftMostOccurence(int[] arr, int l, int h, int x) {

        if (l > h) {
            return -1;
        }

        int mid = l + (h-l)/2;

        if (arr[mid] == x && (mid ==0 || arr[mid-1] != x)) {
            return mid;
        }
        else if (x <= arr[mid]) {
            return leftMostOccurence(arr, l, mid-1, x);
        }
        else {
            return leftMostOccurence(arr, mid+1, h, x);
        }
    }

    static int rightMostOccurence(int[] arr, int l, int h, int x, int n) {

        if (l > h) {
            return -1;
        }

        int mid = l + (h-l)/2;

        if (arr[mid] == x && (mid == n-1 || arr[mid+1] != x)) {
            return mid;
        }
        else if (x < arr[mid]) {
            return rightMostOccurence(arr, l, mid-1, x, n);
        }
        else {
            return rightMostOccurence(arr, mid+1, h, x, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 3, 3, 3, 3};

        int leftMostIndex = leftMostOccurence(arr, 0, arr.length-1, 3);
        System.out.println(leftMostIndex);

        int rightMostOccurence = rightMostOccurence(arr, 0, arr.length-1, 3, arr.length);
        System.out.println(rightMostOccurence);

        System.out.println(rightMostOccurence-leftMostIndex+1);
    }
}
