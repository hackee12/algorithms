package hackee12.misc.boatsToSavePeople;

/*
Calculate the minimum number of rescue boats required to hold all the passengers.
The i-th passenger weighs weights[i].
Each boat can carry no more than 2 passengers if they don't exceed the weight limit:
 weights[i] + weights[j] <= boatLimit.
The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
Individual passenger won't exceed the weight limit;
 */
public interface MinRescueBoatsProblem {

    int numRescueBoats(int[] weights, int boatWeightLimit);
}
