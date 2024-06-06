package com.csk.ds.arrays.problems;

import java.util.HashMap;
import java.util.Map;

class LongestConsecutiveElem {

    static int longestConsecutive(int[] nums) {

        int l = nums.length;

        if (l <= 1) {
            return 1;
        }

        Map<Integer, Integer> longest = new HashMap<>();

        for (int n: nums) {

            longest.put(n, null);
        }

        int max = 1;

        for (int n: nums) {

            max = Math.max(max, dfs(n, longest));
        }

        return max;
    }

    private static int dfs(int start, Map<Integer, Integer> longest) {

        if (!longest.containsKey(start)) {

            return 0;
        }

        if (longest.get(start) != null) {

            return longest.get(start);
        }

        int currentLongest = 1 + dfs(start + 1, longest);

        longest.put(start, currentLongest);

        return currentLongest;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {100,4,200,1,3,2};

        System.out.println(longestConsecutive(arr));
    }
}
