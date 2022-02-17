package com.rackerrank.designerpdfviewer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class DesignerPdfViewer {
    public static void main(String[] args) {

        List<Integer> h = List.of(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
        String word = "abc";
        System.out.println(run(h,word));
    }

    public static int run(List<Integer> h, String word) {
        // Write your code here
        Map<String, Integer> mapWords = createMap(h);
        String[] words = word.split("");
        int biggest = 0;
        int comparator = 0;

        for(int i = 0; i<word.length(); i++){
            if(mapWords.get(words[i]) > biggest){
                biggest = mapWords.get(words[i]);
            }
        }
        return biggest * word.length();
    }

    private static Map<String, Integer>  createMap(List<Integer> h) {
        Map<String, Integer> mapWords = new HashMap<String, Integer>();
        mapWords.put("a",h.get(0));
        mapWords.put("b",h.get(1));
        mapWords.put("c",h.get(2));
        mapWords.put("d",h.get(3));
        mapWords.put("e",h.get(4));
        mapWords.put("f",h.get(5));
        mapWords.put("g",h.get(6));
        mapWords.put("h",h.get(7));
        mapWords.put("i",h.get(8));
        mapWords.put("j",h.get(9));
        mapWords.put("k",h.get(10));
        mapWords.put("l",h.get(11));
        mapWords.put("m",h.get(12));
        mapWords.put("n",h.get(13));
        mapWords.put("o",h.get(14));
        mapWords.put("p",h.get(15));
        mapWords.put("q",h.get(16));
        mapWords.put("r",h.get(17));
        mapWords.put("s",h.get(18));
        mapWords.put("t",h.get(19));
        mapWords.put("u",h.get(20));
        mapWords.put("v",h.get(21));
        mapWords.put("w",h.get(22));
        mapWords.put("x",h.get(23));
        mapWords.put("y",h.get(24));
        mapWords.put("z",h.get(25));
        return mapWords;
    }
}
