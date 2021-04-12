package hackee12.arrays.findSingleNumber;

public class FindSingleNumber_XorSolution implements FindSingleNumberProblem {
    @Override
    public int singleNumber(int[] nums) {
        int xorSum = 0;
        for (int n : nums) {
            xorSum ^= n;
        }
        return xorSum;
    }
}
