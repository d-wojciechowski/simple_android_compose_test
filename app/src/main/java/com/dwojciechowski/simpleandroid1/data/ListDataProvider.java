package com.dwojciechowski.simpleandroid1.data;

import android.util.Pair;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListDataProvider {

    public static List<Pair<String, String>> getData() {
        return IntStream.rangeClosed(0, 99).mapToObj(i -> new Pair<>(String.valueOf(i), " Lorem Ipsum " + i)).collect(Collectors.toList());
    }

    public static Pair<String, String> getData(long id) {
        return new Pair<>(String.valueOf(id), " Lorem Ipsum " + id);
    }
}
