package com.csk.gfg.problems;

class Anagram {

    static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i=0; i < s1.length(); i++) {

            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        System.out.println("Hii");
        for (int i=0; i < 256; i++) {

            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isAnagram_withNoExtraSpace(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        int count1 = 0;
        int count2 = 0;

        for (int i=0; i < s1.length(); i++) {

            count1 += s1.charAt(i);
            count2 += s2.charAt(i);
        }

        return count1 == count2;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("ABCD", "CABD"));
        System.out.println(isAnagram_withNoExtraSpace("ABCD", "CABE"));
    }
}
