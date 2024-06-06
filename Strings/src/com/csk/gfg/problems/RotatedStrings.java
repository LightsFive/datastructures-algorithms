package com.csk.gfg.problems;

class RotatedStrings {

    /*
    This method takes O(n^2) time, as comparing two strings take O(n). In every iteration we compare two strings, so solution takes O(n^2).
     */
    static boolean rotatedString(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n != m) {
            return false;
        }

        for (int i = 0; i < n; i++) {

            if ((s1.substring(i) + s1.substring(0, i)).equals(s2)) {

                return true;
            }

        }
        return false;
    }

    static boolean checkForSubString(String s1, String s2) {

        s1 = s1 + s1;
        int n = s1.length();
        int m = s2.length();

        for (int i=0; i < n /2; i++) {

            if (s1.charAt(i) == s2.charAt(0)) {
                int start = i+1;
                int j = 1;

                while (start < n && j < m && s1.charAt(start) == s2.charAt(j)) {
                    start++;
                    j++;
                }

                if (j == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(rotatedString("ABCD", "CDAB"));
        System.out.println(rotatedString("ABAAA", "BAAAA"));
        System.out.println(rotatedString("ABAB", "ABBA"));

        System.out.println(checkForSubString("ABCD", "CDAB"));
        System.out.println(checkForSubString("ABCD", "CDBA"));
    }
}
