package hackee12.misc.boatsToSavePeople;

import java.util.Arrays;

public class GreedyTwoPointerSolution implements MinRescueBoatsProblem {

    @Override
    public int numRescueBoats(int[] weights, int boatWeightLimit) {
        Arrays.sort(weights);
        int i = 0, j = weights.length - 1;
        int ans = 0;
        while (i <= j) {
            ans++;
            if (weights[i] + weights[j] <= boatWeightLimit) i++;
            j--;
        }
        return ans;
    }
}
