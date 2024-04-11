package hackee12.arrays.buySellStock;

/**
 * Given an integer array of stock prices[].
 * Maximize profit by selling stock.
 * Buy stock once.
 * Sell stock on a later day in the future.
 * Return maximum positive profit or 0.
 * Limitations:
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
public interface BuySellStockProblem {
    int maxProfit(int[] prices);
}
