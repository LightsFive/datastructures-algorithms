package com.csk.ds.recursion.problems;

class SumOfDigits {

    static int sumOfDigits(int n, int sum) {

        if (n < 10) {
            return n + sum;
        }

        return sumOfDigits(n/10, sum + (n % 10));
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(253, 0));
        System.out.println(sumOfDigits(254, 0));
        System.out.println(sumOfDigits(9987, 0));
        System.out.println(sumOfDigits(1, 0));
        System.out.println(sumOfDigits(11, 0));
        System.out.println(sumOfDigits(10, 0));
        System.out.println(sumOfDigits(01, 0));
    }
}
