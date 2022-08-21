package com.ahmad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void invalidParenthesisReturnFalse() {
        final Boolean actualResult = validParentheses.isValid("[)");
        final Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void validParenthesisReturnTrue() {
        boolean actualResult = validParentheses.isValid("(){}[]");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
