package com.csk.ds.recursion.problems;

class PrintNTo1 {

    static void printNTo1(int n) {

        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
    }

    static void print1ToN(int n) {

        if (n < 1) {
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
    }

    static void print1ToN_tailRecursive(int n, int i) {

        if (n < 1) {
            return;
        }
        System.out.println(i);
        print1ToN_tailRecursive(n-1, ++i);
    }

    public static void main(String[] args) {
        //printNTo1(9);
        //print1ToN(9);

        print1ToN_tailRecursive(9, 1);
    }
}
