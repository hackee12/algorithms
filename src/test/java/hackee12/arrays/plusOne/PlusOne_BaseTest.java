package hackee12.arrays.plusOne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public abstract class PlusOne_BaseTest {

    public abstract PlusOne_Problem getSolution();

    @Parameter(0)
    public int[] digits;

    @Parameter(1)
    public int[] plusOne;

    @Parameters
    public static Object[][] parameters() {
        return new Object[][]{
                {
                        new int[]{0},
                        new int[]{1}
                },
                {
                        new int[]{1, 0},
                        new int[]{1, 1}
                },
                {
                        new int[]{1, 9},
                        new int[]{2, 0}
                },
                {
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                        new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0},
                },
                {
                        new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                        new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1},
                },
                {
                        new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9},
                        new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0},
                },
        };
    }

    @Test
    public void test() {
        assertArrayEquals(plusOne, getSolution().plusOne(digits));
    }
}