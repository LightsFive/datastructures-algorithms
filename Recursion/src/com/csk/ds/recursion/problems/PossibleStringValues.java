package com.csk.ds.recursion.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PossibleStringValues {

    static List<String> print(String s) {

        if (s.length() == 0) {
            var list = new ArrayList<String>();
            list.add("");
            return list;
        }

        List<String> result = print(s.substring(0, s.length()-1));

        List<String> temp = new ArrayList<>();

        for (String el: result) {

            String str = el + s.charAt(s.length()-1);
            temp.add(str);
        }

        result.addAll(temp);

        return result;
    }

    static void printSub(String s, String curr, int index) {

        if (index == s.length()) {
            System.out.print(curr + " ");
            return;
        }

        printSub(s, curr, index+1);
        printSub(s, curr+ s.charAt(index), index+1);
    }

    public static void main(String[] args) {
        printSub("ABC", "", 0);
    }
}
