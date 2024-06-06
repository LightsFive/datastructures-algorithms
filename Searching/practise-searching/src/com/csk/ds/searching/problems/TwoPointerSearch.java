package com.csk.ds.searching.problems;

class TwoPointerSearch {

    static boolean search(int[] arr, int n, int x) {

        int left = 0;
        int right = n-1;

        while (left < right) {
            if (arr[left] + arr[right] == x) {
                return true;
            }
            else if (arr[left] + arr[right] > x) {
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 8, 12, 30};

        System.out.println(TwoPointerSearch.search(arr, arr.length, 17));
        System.out.println(TwoPointerSearch.search(arr, arr.length, 20));
        System.out.println(TwoPointerSearch.search(arr, arr.length, 13));
        System.out.println(TwoPointerSearch.search(arr, arr.length, 2));
        System.out.println(TwoPointerSearch.search(arr, arr.length, 32));
        System.out.println(TwoPointerSearch.search(arr, arr.length, 18));
        System.out.println(TwoPointerSearch.search(arr, arr.length, -1));
    }
}
