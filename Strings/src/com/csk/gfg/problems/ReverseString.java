package com.csk.gfg.problems;

public class ReverseString {

    static String reverse(String str) {

        int l = 0;
        int r = str.length() -1;
        char[] reversedString = str.toCharArray();

        while (l < r) {

            if (reversedString[l] != '$' && reversedString[r] != '$') {
                char temp = reversedString[l];
                reversedString[l] = reversedString[r];
                reversedString[r] = temp;
                l++;
                r--;
            }

            if (reversedString[l] == '$') {
                l++;
            }

            if (reversedString[r] == '$') {
                r--;
            }
        }

        return String.valueOf(reversedString);
    }

    public static void main(String[] args) {

        System.out.println(reverse("Java"));
        System.out.println(reverse("Python"));
        System.out.println(reverse("Ab$c$de$$"));
        System.out.println(reverse(reverse("Golang")));
    }
}
