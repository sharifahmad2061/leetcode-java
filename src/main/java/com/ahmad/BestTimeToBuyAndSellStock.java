package com.ahmad;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int cheapestPriceSoFar = Integer.MAX_VALUE;
        int currentProfit = 0;
        int overallProfit = 0;
        for (int index = 0; index < prices.length; index++) {
            if (prices[index] < cheapestPriceSoFar)
                cheapestPriceSoFar = prices[index];
            currentProfit = prices[index] - cheapestPriceSoFar;
            if (currentProfit > overallProfit)
                overallProfit = currentProfit;
        }
        return overallProfit;
    }
}
// strategy 1
// sort by prices and k
