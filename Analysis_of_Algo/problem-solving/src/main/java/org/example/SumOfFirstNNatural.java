package org.example;

public class SumOfFirstNNatural {

    private static int getSum(int n) {

        int sum = 0;

        for (int i=1; i <= n; i++) {

            sum += i;
        }

        return sum;
    }

    private static int getSum_Recursive(int n) {

        if (n == 1 || n < 1) {

            return n;
        }

        return n + getSum_Recursive(n-1);
    }

    public static void main(String[] args) {

        System.out.println("sum =" + getSum(3));
        System.out.println("sum =" + getSum(4));
        System.out.println("sum =" + getSum(5));
        System.out.println("sum =" + getSum(6));

        System.out.println("sum =" + getSum_Recursive(3));
        System.out.println("sum =" + getSum_Recursive(4));
        System.out.println("sum =" + getSum_Recursive(5));
        System.out.println("sum =" + getSum_Recursive(6));
        System.out.println("sum =" + getSum_Recursive(1));
    }
}
