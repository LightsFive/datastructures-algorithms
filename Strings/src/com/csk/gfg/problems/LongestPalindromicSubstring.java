package com.csk.gfg.problems;

class LongestPalindromicSubstring {

    static String longestPalindrome(String s) {

        String result = "";
        int max = Integer.MIN_VALUE;

        for (int i=0; i < s.length(); i++) {

            String temp = "";

            for (int j=i; j < s.length(); j++) {

                temp += s.charAt(j);

                if (temp.length() > 0) {
                    if (isPalindrome(temp) && temp.length() > max) {
                        max = temp.length();
                        result = temp;
                    }
                }

            }
        }

        return result;

    }

    private static boolean isPalindrome(String str) {

        int l = 0;
        int r = str.length()-1;

        if (l == r) {
            return true;
        }

        while (l < r) {

            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // uses dynamic programming approach
    static String longestPalindromeUsingDP(String s) {

        if (s.length() == 1) {
            return s;
        }

        String result = "";
        int n = s.length();
        boolean[][] table = new boolean[n][n];

        // all lengths of 1 are palindromes
        for (int i=0; i < n; i++) {
            table[i][i] = true;
        }

        for (int i=0; i < n-1; i++) {

            if (s.charAt(i) == s.charAt(i+1)) {
                table[i][i+1] = true;
                result = s.substring(i, i+2);
            }
        }

        for (int k = 3; k <=n; k++) {

            for (int i=0; i < n - k +1; i++) {

                int j = i + k -1;

                if (table[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                    result = s.substring(i, j+1);
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
