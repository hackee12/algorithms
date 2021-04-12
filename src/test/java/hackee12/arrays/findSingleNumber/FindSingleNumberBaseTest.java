package hackee12.arrays.findSingleNumber;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class FindSingleNumberBaseTest {

    public abstract FindSingleNumberProblem getSolution();

    @Parameterized.Parameter(0)
    public int[] nums;

    @Parameterized.Parameter(1)
    public int answer;

    @Parameterized.Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {
                        new int[]{0},
                        0
                },
                {
                        new int[]{1,2,1},
                        2
                },
                {
                        new int[]{2,2,1},
                        1
                },
                {
                        new int[]{1,2,2},
                        1
                },
                {
                        new int[]{1,2,1,2,3},
                        3
                },
                {
                        new int[]{1,4,2,3,1,2,3},
                        4
                },
        };
    }

    @Test
    public void test() {
        Assert.assertEquals(answer, getSolution().singleNumber(nums));
    }

}
