package com.csk.ds.arrays.problems;

import java.util.HashMap;
import java.util.Map;

class LargestSubArrayWith0Sum {

    static int maxLen(int arr[], int n)
    {

        int currSum = 0;
        int maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < n; i++) {

            currSum += arr[i];

            if (currSum == 0) {
                maxLen = Math.max(maxLen, i+1);
            }
            else if (map.containsKey(currSum)) {

                maxLen = Math.max(maxLen, i - map.get(currSum));
            }
            else {
                map.put(currSum, i);
            }

        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {15,-2,2,-8,1,7,10,23};

        //System.out.println(maxLen(arr, arr.length));

        int[] arr1 = {-1, 1, -1, 1};

        System.out.println(maxLen(arr1, arr1.length));
    }
}
