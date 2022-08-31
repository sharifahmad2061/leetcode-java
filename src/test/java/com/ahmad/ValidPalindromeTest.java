package com.ahmad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void testIsPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        Boolean actual = validPalindrome.isPalindrome(s);
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}
