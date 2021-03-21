package hackee12.misc.boatsToSavePeople;

import hackee12.MySolution;

class ImprovedSolution implements MinRescueBoatsProblem, MySolution {

    @Override
    public int numRescueBoats(int[] weights, int boatWeightLimit) {
        int[] weightsLookup = new int[boatWeightLimit + 1];
        for (int w : weights) {
            weightsLookup[w] += 1;
        }
        int boats = 0;
        int heavyPointer = weightsLookup.length - 1;
        int lightPointer = 1;
        for (int i = heavyPointer; i >= 1; i--) {
            while (weightsLookup[i] > 0) {
                weightsLookup[i] -= 1;
                boats++;
                for (int j = lightPointer; j + i <= boatWeightLimit; j++) {
                    if (weightsLookup[j] == 0) {
                        lightPointer++;
                    } else {
                        weightsLookup[j] -= 1;
                        break;
                    }
                }
            }
        }
        return boats;
    }
}