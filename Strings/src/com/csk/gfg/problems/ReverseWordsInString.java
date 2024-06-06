package com.csk.gfg.problems;

class ReverseWordsInString {

    static String reverseWords(char[] arr, int n) {

        int start = 0;

        for (int i=0; i < n; i++) {

            if (arr[i] == ' ') {
                reverse(arr, start, i-1);
                start = i+1;
            }
        }
        reverse(arr, start, n-1);
        reverse(arr, 0, n-1);

        return new String(arr);
    }

    // works for leading and trailing spaces as well.
    public static String reverseWords(String s) {

        int n = s.length();
        int start = 0;
        String input = "";

        for (int i=0; i < n; i++) {

            if ((i == 0 || i == n-1) && s.charAt(i) == ' ') {
                continue;
            }
            else if (s.charAt(i) != ' ' || (input.length() != 0 && s.charAt(i+1) != ' ')){
                input += s.charAt(i);
            }
            else {
                continue;
            }

        }

        System.out.println("Input = " + input);
        char[] res = input.toCharArray();
        n = res.length;
        for (int i=0; i < n; i++) {

            if (input.charAt(i)== ' ') {

                reverse(res, start, i-1);
                start = i+1;
            }

        }
        reverse(res, start, n-1);
        reverse(res, 0, n-1);

        return new String(res);

    }

    private static void reverse(char[] arr, int start, int i) {

        while (start < i) {
            char temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    public static void main(String[] args) {

        String s1 = "  Hello   World   ";
        String s2 = "Hello   World";

        s1 = reverseWords(s1);

        System.out.println("Reversed \n" + s1);

        s2 = reverseWords(s2);

        System.out.println("Reversed \n" + s2);


    }
}
