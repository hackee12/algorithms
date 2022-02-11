package hackee12.arrays.removeDuplicatesFromSorted;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static java.lang.String.format;

@RunWith(Parameterized.class)
public abstract class RemoveDuplicatesFromSortedTest {

    abstract RemoveDuplicatesFromSorted getSolution();

    @Parameterized.Parameter(0)
    public int[] input;

    @Parameterized.Parameter(1)
    public int[] expected;

    @Parameterized.Parameters
    public static Object[] parameters() {
        return new Object[][]{
                {
                        new int[]{},
                        new int[]{}
                },
                {
                        new int[]{0},
                        new int[]{0}
                },
                {
                        new int[]{0, 0},
                        new int[]{0},
                },
                {
                        new int[]{0, 0, 0},
                        new int[]{0},
                },
                {
                        new int[]{0, 1},
                        new int[]{0, 1},
                },
                {
                        new int[]{0, 0, 1},
                        new int[]{0, 1},
                },
                {
                        new int[]{0, 0, 1, 1},
                        new int[]{0, 1},
                },
                {
                        new int[]{0, 0, 1, 1, 1},
                        new int[]{0, 1},
                },
                {
                        new int[]{0, 0, 1, 1, 2},
                        new int[]{0, 1, 2},
                },
                {
                        new int[]{0, 1, 2, 3, 4},
                        new int[]{0, 1, 2, 3, 4},
                },
                {
                        new int[]{0, 1, 1, 2, 3},
                        new int[]{0, 1, 2, 3},
                },
                {
                        new int[]{0, 1, 1, 1, 2},
                        new int[]{0, 1, 2},
                }
        };
    }

    @Test
    public void test() {
        int outputLength = getSolution().removeDuplicates(input);
        if (expected.length != outputLength) {
            Assert.fail(
                    format("Assertion failed: output length doesn't match: expected %s != provided %s.",
                            expected.length, outputLength));
        }
    }
}