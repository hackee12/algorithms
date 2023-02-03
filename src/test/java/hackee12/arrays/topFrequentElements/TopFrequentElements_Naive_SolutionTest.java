package hackee12.arrays.topFrequentElements;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TopFrequentElements_Naive_SolutionTest {

    @Parameter(0)
    public int[] nums;
    @Parameter(1)
    public int k;
    @Parameter(2)
    public int[] expected;

    @Parameters
    public static Object[][] testCases() {
        return new Object[][]{
                {
                        new int[]{1, 1, 1, 2, 2, 3},
                        2,
                        new int[]{1, 2}
                },
                {
                        new int[]{1},
                        1,
                        new int[]{1}
                },
                {
                        new int[]{-1, -1},
                        1,
                        new int[]{-1}
                },
                {
                        new int[]{-1, -2},
                        2,
                        new int[]{-1, -2}
                }
        };
    }

    @Test
    public void t() {
        int[] tops = new TopFrequentElements_NaiveSolution().topKFrequent(nums, k);
        Arrays.sort(expected);
        Arrays.sort(tops);
        Assert.assertArrayEquals(expected, tops);
    }
}