package hackee12.misc.boatsToSavePeople;

import hackee12.MySolution;

class InitialSolution implements MinRescueBoatsProblem, MySolution {

    @Override
    public int numRescueBoats(int[] weights, int boatWeightLimit) {
        int[] weightsLookup = new int[boatWeightLimit + 1];
        for (int w : weights) {
            weightsLookup[w] += 1;
        }
        int boats = 0;
        for (int i = weightsLookup.length - 1; i >= 1; i--) {
            while (weightsLookup[i] > 0) {
                weightsLookup[i] -= 1;
                boats++;
                for (int e = boatWeightLimit - i; e > 0; e--) {
                    if (weightsLookup[e] > 0) {
                        weightsLookup[e] -= 1;
                        break;
                    }
                }
            }
        }
        return boats;
    }
}