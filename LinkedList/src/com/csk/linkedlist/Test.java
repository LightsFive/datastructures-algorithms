package com.csk.linkedlist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    // Output should be exactly like --> {BYE-3 ,EPAM-6, HI-2}

    public static void main(String[] args) {

        String strSentence = "Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";

        var required = List.of("BYE", "EPAM", "HI");

        Arrays.stream(strSentence.split(" "))
                .map(String::toUpperCase)
                .filter(word -> required.contains(word))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + "-" + count));
    }
}
