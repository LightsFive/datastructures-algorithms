package com.csk.ds.recursion;

class Factorial {

    static int factorial(int n) {

        if (n == 0) {

            return 1;
        }

        return n * factorial(n-1);
    }

    static int factorial_recursive(int n, int result) {

        if (n == 0) {

            return result;
        }

        return factorial_recursive(n-1, n * result);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));
    }
}
