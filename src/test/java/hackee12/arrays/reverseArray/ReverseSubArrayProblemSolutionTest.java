package hackee12.arrays.reverseArray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ReverseSubArrayProblemSolutionTest {

    private static final ReverseSubArrayProblem solution = new ReverseSubArrayProblemSolution();

    @Parameter
    public int[] nums;
    @Parameter(1)
    public int from;
    @Parameter(2)
    public int to;
    @Parameter(3)
    public int[] expected;

    @Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {
                        new int[]{1},
                        0,
                        0,
                        new int[]{1}
                },
                {
                        new int[]{1},
                        0,
                        1,
                        new int[]{1}
                },
                {
                        new int[]{1, 2},
                        0,
                        1,
                        new int[]{1, 2}
                },
                {
                        new int[]{1, 2},
                        1,
                        2,
                        new int[]{1, 2}
                },
                {
                        new int[]{1, 2, 3},
                        0,
                        3,
                        new int[]{3, 2, 1}
                },
                {
                        new int[]{1, 2, 3, 4},
                        0,
                        2,
                        new int[]{2, 1, 3, 4}
                },
                {
                        new int[]{1, 2, 3, 4},
                        1,
                        3,
                        new int[]{1, 3, 2, 4}
                },
                {
                        new int[]{1, 2, 3, 4},
                        1,
                        4,
                        new int[]{1, 4, 3, 2}
                },
                {
                        new int[]{1, 2, 3, 4, 5},
                        1,
                        4,
                        new int[]{1, 4, 3, 2, 5}
                },
                {
                        new int[]{1, 2, 3, 4, 5},
                        1,
                        5,
                        new int[]{1, 5, 4, 3, 2}
                },
        };
    }

    @Test
    public void testSolution() {
        solution.reverse(nums, from, to);
        Assert.assertArrayEquals(expected, nums);
    }
}