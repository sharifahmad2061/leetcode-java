package com.ahmad;

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
}
