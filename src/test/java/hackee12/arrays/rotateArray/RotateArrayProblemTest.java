package hackee12.arrays.rotateArray;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class RotateArrayProblemTest {

    private static final RotateArrayProblem solution = new RotateArrayProblem_InPlaceReverse();

    private final int[] nums;
    private final int times;
    private final int[] expected;

    public RotateArrayProblemTest(int[] nums, int times, int[] expected) {
        this.expected = expected;
        this.nums = nums;
        this.times = times;
    }

    @Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {new int[]{1}, 0, new int[]{1}},
                {new int[]{1}, 1, new int[]{1}},
                {new int[]{1}, 2, new int[]{1}},

                {new int[]{1, 2, 3}, 0, new int[]{1, 2, 3}},
                {new int[]{1, 2, 3}, 3, new int[]{1, 2, 3}},
                {new int[]{1, 2, 3}, 6, new int[]{1, 2, 3}},

                {new int[]{1, 2, 3}, 1, new int[]{3, 1, 2}},
                {new int[]{1, 2, 3}, 2, new int[]{2, 3, 1}},
                {new int[]{1, 2, 3}, 4, new int[]{3, 1, 2}},

                {new int[]{1, 2, 3, 4}, 1, new int[]{4, 1, 2, 3}},
                {new int[]{1, 2, 3, 4}, 2, new int[]{3, 4, 1, 2}},
                {new int[]{1, 2, 3, 4}, 3, new int[]{2, 3, 4, 1}},
                {new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4}},
                {new int[]{1, 2, 3, 4}, 5, new int[]{4, 1, 2, 3}},
        };
    }

    @Test
    public void rotate() {
        solution.rotate(nums, times);
        assertArrayEquals(expected, nums);
    }
}