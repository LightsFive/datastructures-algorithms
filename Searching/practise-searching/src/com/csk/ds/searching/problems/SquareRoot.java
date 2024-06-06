package com.csk.ds.searching.problems;

class SquareRoot {

    static int findSquareRoot(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (mid * mid == x) {
                ans = mid;
                break;
            }
            else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int squareRoot = SquareRoot.findSquareRoot(26);

        System.out.println("Square Root is = " + squareRoot);

    }
}
