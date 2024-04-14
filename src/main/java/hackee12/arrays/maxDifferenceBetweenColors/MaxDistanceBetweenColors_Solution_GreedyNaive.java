package hackee12.arrays.maxDifferenceBetweenColors;

public class MaxDistanceBetweenColors_Solution_GreedyNaive implements MaxDistanceBetweenColors_Problem {
    @Override
    public int maxDistance(int[] colors) {
        int distance = 0;
        for (int i = 0, j = colors.length - 1; i < j; i++) {
            if (colors[i] != colors[j]) {
                distance = Math.max(distance, j - i);
                break;
            }
        }
        for (int i = 0, j = colors.length - 1; i < j; j--) {
            if (colors[i] != colors[j]) {
                distance = Math.max(distance, j - i);
                break;
            }
        }
        return distance;
    }
}
