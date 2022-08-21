package com.ahmad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    @DisplayName("[)")
    void invalidParenthesisReturnFalse() {
        final Boolean actualResult = validParentheses.isValid("[)");
        final Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("({[]})(")
    void invalidParenthesisReturnFalse2nd() {
        final Boolean actualResult = validParentheses.isValid("({[]})(");
        final Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("({[]})}")
    void invalidParenthesisReturnFalse3rd() {
        final Boolean actualResult = validParentheses.isValid("({[]})}");
        final Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("([]){{{}}[]")
    void invalidParenthesisReturnFalse4th() {
        final Boolean actualResult = validParentheses.isValid("([]){{{}}[]");
        final Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("(){}[]")
    void validParenthesisReturnTrue() {
        boolean actualResult = validParentheses.isValid("(){}[]");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("([]){{}}[]")
    void validParenthesisReturnTrue2nd() {
        boolean actualResult = validParentheses.isValid("([]){{}}[]");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("(){}[[()]]")
    void validParenthesisReturnTrue3rd() {
        boolean actualResult = validParentheses.isValid("(){}[[()]]");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("(){()}[]")
    void validParenthesisReturnTrue4th() {
        boolean actualResult = validParentheses.isValid("(){()}[]");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
