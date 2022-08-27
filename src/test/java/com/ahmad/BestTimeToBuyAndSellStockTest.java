package com.ahmad;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    void test1() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
        Assertions.assertEquals(5, profit);
    }

    @Test
    void test2() {
        int[] prices = { 7, 6, 4, 3, 1 };
        int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
        Assertions.assertEquals(0, profit);
    }

    // @Test
    // void test3() {
    // File inputFile = new
    // File(getClass().getClassLoader().getResource("/input_ints.txt").getFile());
    // Scanner input = new Scanner(inputFile);
    // int[] prices = new int[66449];
    // int index = 0;
    // while (input.hasNextInt()) {
    // prices[index] = input.nextInt();
    // index++;
    // }

    // int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
    // Assertions.assertEquals(0, profit);

    // }
}
