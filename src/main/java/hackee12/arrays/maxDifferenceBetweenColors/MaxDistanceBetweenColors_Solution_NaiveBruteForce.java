package hackee12.arrays.maxDifferenceBetweenColors;

public class MaxDistanceBetweenColors_Solution_NaiveBruteForce
        implements MaxDistanceBetweenColors_Problem {
    @Override
    public int maxDistance(int[] colors) {
        // Constraints are small.
        // Brute-force is good enough.
        int distance = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    distance = Math.max(distance, j - i);
                }
            }
        }
        return distance;
    }
}
