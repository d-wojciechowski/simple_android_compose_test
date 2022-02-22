package com.dwojciechowski.simpleandroid1.data;

import android.util.Pair;

import com.dwojciechowski.simpleandroid1.model.Detailed;
import com.dwojciechowski.simpleandroid1.model.Recipee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListDataProvider {

    public static List<Pair<String, String>> getData() {
        return IntStream.rangeClosed(0, 99).mapToObj(i -> new Pair<>(String.valueOf(i), " Lorem Ipsum " + i)).collect(Collectors.toList());
    }

    public static Detailed getData(long id) {
        List<String> details = IntStream.rangeClosed(0, 10).mapToObj(i -> " Lorem Ipsum " + i).collect(Collectors.toList());
        return new Recipee(String.valueOf(id), details);
    }
}
