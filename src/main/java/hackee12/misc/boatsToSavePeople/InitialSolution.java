package hackee12.misc.boatsToSavePeople;

import hackee12.MySolution;

class InitialSolution implements MinRescueBoatsProblem, MySolution {

    @Override
    public int numRescueBoats(int[] people, int boatWeightLimit) {
        int[] weights = new int[boatWeightLimit + 1];
        for (int w : people) {
            weights[w] += 1;
        }
        int boats = 0;
        for (int i = weights.length - 1; i >= 1; i--) {
            while (weights[i] > 0) {
                weights[i] -= 1;
                boats++;
                for (int e = boatWeightLimit - i; e > 0; e--) {
                    if (weights[e] > 0) {
                        weights[e] -= 1;
                        break;
                    }
                }
            }
        }
        return boats;
    }
}