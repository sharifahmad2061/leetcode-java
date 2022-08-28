package com.ahmad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemovingStarsFromAStringTest {

    RemovingStarsFromAString removingStarsFromAString = new RemovingStarsFromAString();

    @Test
    void testRemoveStars1() {
        String s = "leet**cod*e";
        String expected = "lecoe";
        String actual = removingStarsFromAString.removeStars(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveStars2() {
        String s = "erase*****";
        String expected = "";
        String actual = removingStarsFromAString.removeStars(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveStars3() {
        String s = "l*eet**cod*e";
        String expected = "ecoe";
        String actual = removingStarsFromAString.removeStars(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveStars4() {
        String s = "*leet**cod*e";
        String expected = "lecoe";
        String actual = removingStarsFromAString.removeStars(s);
        Assertions.assertEquals(expected, actual);
    }
}
