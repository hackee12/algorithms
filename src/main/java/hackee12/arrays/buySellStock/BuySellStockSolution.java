package hackee12.arrays.buySellStock;

import java.util.Arrays;

public class BuySellStockSolution implements BuySellStockProblem {
    @Override
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            maxProfit = Math.max(price - minPrice, maxProfit);
            minPrice = Math.min(price, minPrice);
        }
        return maxProfit;
    }
}
