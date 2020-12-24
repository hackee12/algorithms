package hackee12.binarySearch.basic;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearchSolutionTest {

    private static final BinarySearchSolution solution = new BinarySearchSolution();

    @Test(timeout = 1000L)
    public void test() {
        Triplet[] testCases = {
                new Triplet(new int[]{}, 1, -1),
                new Triplet(new int[]{0}, 1, -1),
                new Triplet(new int[]{0}, 0, 0),
                new Triplet(new int[]{0, 1}, 0, 0),
                new Triplet(new int[]{0, 1}, 1, 1),
                new Triplet(new int[]{0, 1, 2}, 1, 1),
                new Triplet(new int[]{0, 1, 2}, 2, 2),
                new Triplet(new int[]{0, 1, 2}, 3, -1),
                new Triplet(new int[]{0, 1, 3}, 2, -1),
                new Triplet(new int[]{0, 2, 3}, 1, -1),
                new Triplet(new int[]{1, 2, 3}, 0, -1),
                new Triplet(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
        };
        for (Triplet testCase : testCases) {
            assertEquals("TestCase failed: " + testCase,
                    testCase.answer,
                    solution.search(testCase.nums, testCase.target));
        }
    }

    private static final class Triplet {
        private final int[] nums;
        private final int target;
        private final int answer;

        private Triplet(int[] nums, int target, int answer) {
            this.nums = nums;
            this.target = target;
            this.answer = answer;
        }

        @Override
        public String toString() {
            return String.format(
                    "{ \"nums\": %s, \"target\": %d, \"answer\": %d }", Arrays.toString(nums), target, answer);
        }
    }
}