package com.csk.gfg.problems;

import java.util.Arrays;

class LeftMostNonRepeatingChar {

    static int findLeftMostNonRepeatingCharacter(String s) {

        int n = s.length();
        int[] count = new int[256];

        for (int i=0; i < n; i++) {

            count[s.charAt(i)]++;
        }

        for (int i=0; i < n; i++) {

            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    static int findLeftMostNonRepeatingOneTraversal(String s) {

        int n = s.length();
        int[] count = new int[256];
        Arrays.fill(count, -1);
        int res = Integer.MAX_VALUE;

        for (int i=0; i < n; i++) {

            if (count[s.charAt(i)] == -1) {

                count[s.charAt(i)] = i;
            }
            else {

                count[s.charAt(i)] = -2;
            }
        }

        for (int i=0; i < 256; i++) {

            if (count[i] >= 0) {

                res = Math.min(res, count[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {

        System.out.println(findLeftMostNonRepeatingCharacter("Krishna"));
        System.out.println(findLeftMostNonRepeatingCharacter("GeeksforGeeks"));
        System.out.println(findLeftMostNonRepeatingCharacter("abcabc"));

        System.out.println("------ One Travesal ---");

        System.out.println(findLeftMostNonRepeatingOneTraversal("Krishna"));
        System.out.println(findLeftMostNonRepeatingOneTraversal("GeeksforGeeks"));
        System.out.println(findLeftMostNonRepeatingOneTraversal("abcabc"));
    }
}
