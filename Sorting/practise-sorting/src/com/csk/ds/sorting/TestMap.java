package com.csk.ds.sorting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {

    public static void main(String[] args) {

        Map<String, LinkedList<String>> map = new HashMap<>();

        var values1 = new LinkedList<String>();

        values1.add("Naruto");
        values1.add("Onepiece");

        var values2 = new LinkedList<String>();

        values2.add("RaceGurram");
        values2.add("Bahubali");

        map.put("Anime", values1);
        map.put("Movies", values2);

        map.entrySet().forEach(entry -> {
                entry.getValue().forEach(value -> value.toUpperCase());
        });

        map.entrySet()
                .stream()
                .collect(Collectors.toMap(Function.identity(),
                        entry -> {
                            entry.getValue().stream().forEach(String::toUpperCase);
                            return entry.getValue();
                        }));
    }
}
