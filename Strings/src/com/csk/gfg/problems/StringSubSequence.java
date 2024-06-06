package com.csk.gfg.problems;

class StringSubSequence {

    // Krishna
    // Kisna, Ksina

    static boolean isSubSequnceInRecursion(String s1, String s2) {

        if (s1.length() < s2.length()) {
            return false;
        }

        if (s1.length() ==0 && s2.length() > 0) {
            return false;
        }
        else if (s2.length() == 0) {
            return true;
        }

        if (s1.charAt(0) == s2.charAt(0)) {

            return isSubSequnce(s1.substring(1), s2.substring(1));
        }
        else {
            return isSubSequnce(s1.substring(1), s2.substring(0));
        }
    }

    static boolean isSubSequnce(String s1, String s2) {

        if (s1.length() < s2.length()) {
            return false;
        }

        int i=0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            }
            else {
                i++;
            }
        }

        return j == s2.length();
    }

    static boolean isSubSequnceSimpler(String s1, String s2) {

        return s1.indexOf(s2) > 0;
    }

    public static void main(String[] args) {

        System.out.println(isSubSequnce("Krishna", "Kisna"));
        System.out.println(isSubSequnce("Krishna", "Ksina"));
        System.out.println(isSubSequnce("Krishna", "Krishna"));
        System.out.println(isSubSequnce("Krishna", ""));
        System.out.println(isSubSequnce("Krishna", "K"));
        System.out.println(isSubSequnce("Krishna", "Knh"));
        System.out.println(isSubSequnce("Krishna", "KrishnaReddy"));

        System.out.println("-- Using Recursion --");


        System.out.println(isSubSequnceInRecursion("Krishna", "Kisna"));
        System.out.println(isSubSequnceInRecursion("Krishna", "Ksina"));
        System.out.println(isSubSequnceInRecursion("Krishna", "Krishna"));
        System.out.println(isSubSequnceInRecursion("Krishna", ""));
        System.out.println(isSubSequnceInRecursion("Krishna", "K"));
        System.out.println(isSubSequnceInRecursion("Krishna", "Knh"));
        System.out.println(isSubSequnceInRecursion("Krishna", "KrishnaReddy"));
    }
}
