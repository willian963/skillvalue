package com.rackerrank.designerpdfviewer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class DesignerPdfViewer {
    public static void main(String[] args) {

        List<Integer> h = List.of(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
        String word = "abc";
        System.out.println(run(h,word));
    }

    private static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static int run(List<Integer> h, String word) {
        Map<String, Integer> lettersHeight = createMap(h);
        Set<String> letters = new HashSet<>(Arrays.asList(word.split("")));
        Optional<Integer> max = letters.stream().map(lettersHeight::get).max(Integer::compareTo);
        return max.map(biggest -> biggest * word.length()).orElseThrow();
    }

    private static Map<String, Integer> createMap(List<Integer> charactersHeight) {
        return IntStream.range(0, charactersHeight.size())
                .mapToObj(i -> Map.entry(ALPHABET[i], charactersHeight.get(i)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
