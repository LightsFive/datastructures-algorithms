package org.example;

public class DigitCounter {

    private static int getDigitCount(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    private static int getDigitCount_Recursive(int n) {

        if(n == 0) {

            return 0;
        }

        return 1 + getDigitCount_Recursive(n/10);
    }

    private static int getDigitCount_Linear(int n) {

        System.out.println(Math.log10(n));
        System.out.println(Math.floor(Math.log10(n) + 1));

        Math.sqrt(2^2 - 4*1*2);

        return (int) Math.floor(Math.log10(n) + 1);
    }

    public static void main(String[] args) {

        System.out.println(getDigitCount(1234));
        System.out.println(getDigitCount_Linear(12345));
        System.out.println(getDigitCount_Linear(123456789));
        System.out.println(getDigitCount_Recursive(123456));
        System.out.println(getDigitCount_Recursive(1));

    }
}
