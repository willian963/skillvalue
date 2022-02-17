package com.rackerrank.camelcase;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/camelcase/problem
public class CamelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(run(s));
    }

    public static int run(String s) {
        String[] words = s.split("");
        return (int) (Arrays
                .stream(words)
                .filter(w -> w.equals(w.toUpperCase()))
                .count() + 1);
    }
}
