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
        // String res = s;
        // if (s.contains("*")) {
        // int index = s.indexOf("*");
        // if (index != -1) {
        // for (int i = index; i < s.length(); i++) {
        // if (res.charAt(i) == '*') {
        // if (i - 1 > 0) {
        // res = res.substring(0, i - 1) + s.substring(i + 1);
        // } else {
        // res = res.substring(i + 1);
        // }
        // }
        // }
        // }
        // }
        // return res;

        // if (!s.contains("*"))
        // return s;
        // else {
        // int index = s.indexOf("*");
        // if (index - 1 > 0) {
        // return removeStars(s.substring(0, index - 1) + s.substring(index + 1));
        // } else {
        // return removeStars(s.substring(index + 1));
        // }
        // }
        // String res = s;
        // while (res.contains("*")) {
        // int index = res.indexOf("*");
        // if (index - 1 > 0) {
        // res = res.substring(0, index - 1) + res.substring(index + 1);
        // } else {
        // res = res.substring(index + 1);
        // }
        // }
        // return res;

        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (res.length() > 0)
                    res.setLength(res.length() - 1);
            } else
                res.append(c);
        }
        return res.toString();
    }
}
