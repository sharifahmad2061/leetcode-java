package com.ahmad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShotestDistanceToACharacterTest {

    ShotestDistanceToACharacter shotestDistanceToACharacter = new ShotestDistanceToACharacter();

    @Test
    void testShortestToChar() {
        String s = "loveleetcode";
        char c = "e".charAt(0);
        int[] actual = shotestDistanceToACharacter.shortestToChar(s, c);
        int[] expected = { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 };
        Assertions.assertArrayEquals(expected, actual);
    }
}
