package com.ahmad;

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        // char[] input = s.toCharArray();

        // for (int i = 0; i < input.length; i++){
        // if (input[i] != '*') continue;
        // else {
        // int leftIndex = i - 1 > 0 ? i - 1 : null;
        // if (i-1 >= 0){
        // input[i] = '#';
        // input[i-]
        // }
        // else input[i] = '#';
        // }
        // }
        String res = s;
        if (s.contains("*")) {
            int index = s.indexOf("*");
            if (index != -1) {
                for (int i = index; i < s.length(); i++) {
                    if (res.charAt(i) == '*') {
                        if (i - 1 > 0) {
                            res = res.substring(0, i - 1) + s.substring(i + 1);
                        } else {
                            res = res.substring(i + 1);
                        }
                    }
                }
            }
        }
        return res;
    }
}
