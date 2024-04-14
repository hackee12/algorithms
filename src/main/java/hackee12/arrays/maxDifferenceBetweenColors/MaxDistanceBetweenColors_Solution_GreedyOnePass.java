package hackee12.arrays.maxDifferenceBetweenColors;

public class MaxDistanceBetweenColors_Solution_GreedyOnePass implements MaxDistanceBetweenColors_Problem {
    @Override
    public int maxDistance(int[] colors) {
        int distance = 0;
        for (int i = 0, j = colors.length - 1; i < j; i++) {
            if (colors[i] != colors[j]) {
                distance = Math.max(distance, j - i);
            }
            if (colors[0] != colors[j - i]) {
                distance = Math.max(distance, j - i);
            }
            if (distance > 0) {
                return distance;
            }
        }
        throw new IllegalArgumentException("Array must contain at least 2 different colors.");
    }
}
