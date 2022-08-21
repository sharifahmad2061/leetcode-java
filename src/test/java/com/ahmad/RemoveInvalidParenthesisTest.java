package com.ahmad;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveInvalidParenthesisTest {

    RemoveInvalidParenthesis removeInvalidParenthesis = new RemoveInvalidParenthesis();

    @Test
    @DisplayName("()())()")
    void test1() {
        List<String> actualResult = removeInvalidParenthesis.removeInvalidParentheses("()())()");
        List<String> expectedResult = Arrays.asList("(())()", "()()()");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("(a)())()")
    void test2() {
        List<String> actualResult = removeInvalidParenthesis.removeInvalidParentheses("(a)())()");
        List<String> expectedResult = Arrays.asList("(a())()", "(a)()()");
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
