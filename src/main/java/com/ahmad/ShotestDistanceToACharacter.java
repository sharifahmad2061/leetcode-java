package com.ahmad;

public class ShotestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int hitIndex = -1;
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                for (int j = i; j > hitIndex; j--) {
                    res[j] = i - j;
                }
                hitIndex = i;
            }
        }
        return res;
    }
}
