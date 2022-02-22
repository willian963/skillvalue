package com.rackerrank.marsexploration;

//https://www.hackerrank.com/challenges/mars-exploration/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class MarsExploration {
    public static void main(String[] args) {

        String s = "SOSSPSSQSSOR";
        System.out.println(run(s));
    }

    public static int run(String s) {
        int len = s.length();
        int sum = 0;

        for (int i = 0; i < len; i = i + 2) {

            if (i < len && !new Character('S').equals(s.charAt(i)))
                sum++;

            if (i + 1 < len && !new Character('O').equals(s.charAt(i + 1)))
                sum++;

            if (i + 2 >= len) {
                if (!new Character('S').equals(s.charAt(len - 1)))
                    sum++;
            } else {
                if (!new Character('S').equals(s.charAt(i + 2))) {
                    sum++;
                }
            }
            i++;
        }
        return sum;
    }
}
