package org.example;

class DigitsInFactorial {

    static int digitsInFactorial(int n) {

        if (n < 0) {

            return -1;
        }
        if (n <= 1) {
            return 1;
        }

        double fact = 0.0;
        for (int i = 1; i <= n; i++) {

            fact += Math.log10(i);
        }

        return (int) (Math.floor(fact) + 1);
    }

    public static void main(String[] args) {

        System.out.println(digitsInFactorial(10));
        System.out.println(digitsInFactorial(5));
        System.out.println(digitsInFactorial(42));


    }
}
