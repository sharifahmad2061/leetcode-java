package com.ahmad;

public class ValidPalindrome {
    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String onlyLettersAndNumbers = "";
        for (char c : s.toCharArray()) {
            if (isLetterOrDigit(c))
                onlyLettersAndNumbers = onlyLettersAndNumbers + c;
        }
        return onlyLettersAndNumbers == new StringBuilder(onlyLettersAndNumbers).reverse().toString() ? true : false;
    }
}
