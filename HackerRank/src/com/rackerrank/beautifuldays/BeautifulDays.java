package com.rackerrank.beautifuldays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
public class BeautifulDays {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(run(20,23,6));
    }

    static int run(int i, int j, int k) {
        List<String> result = IntStream.rangeClosed(i, j)
                .boxed()
                .map(String::valueOf)
                .filter(s -> (new Integer(s) - new Integer(new StringBuilder(s).reverse().toString())) % k == 0)
                .collect(Collectors.toList());

        return result.size();

    }
}
