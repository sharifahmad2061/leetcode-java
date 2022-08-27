package com.ahmad;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int index = 0; index < prices.length - 1; index++) {
            for (int index2 = index + 1; index2 < prices.length; index2++) {
                if (prices[index2] - prices[index] > profit)
                    profit = prices[index2] - prices[index];
            }
        }
        return profit;
    }
}
