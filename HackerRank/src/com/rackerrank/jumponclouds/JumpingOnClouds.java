package com.rackerrank.jumponclouds;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
public class JumpingOnClouds {
    public static void main(String[] args) {
        int [] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        System.out.println(run(c,k));
    }

    static int run(int[] c, int k) {
        int clouds = 0;
        int thunders = 0;
        int jump = k;
        int numberJumps = 0;
        boolean firstPosition = false;

        while (!firstPosition) {
            if (k < c.length) {
                if (c[k] == 0) {
                    clouds++;
                }
                if (c[k] == 1) {
                    thunders++;
                }
                k = k+jump;
            } else {
                k = (k - c.length);

                if(k==0){
                    if (c[k] == 0) {
                        clouds++;
                    }
                    if (c[k] == 1) {
                        thunders++;
                    }
                    firstPosition = true;
                }
            }
        }
        numberJumps = clouds + thunders;
        return (100 - ((thunders*2) + numberJumps));

    }
}
