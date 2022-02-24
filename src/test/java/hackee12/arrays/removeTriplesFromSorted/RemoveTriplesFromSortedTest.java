package hackee12.arrays.removeTriplesFromSorted;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public abstract class RemoveTriplesFromSortedTest {
    public abstract RemoveTriplesFromSorted getSolution();

    @Parameterized.Parameter(0)
    public int[] inputNumbers;

    @Parameterized.Parameter(1)
    public int[] expected;

    @Test
    public void test() {
        Assert.assertArrayEquals(expected, Arrays.copyOf(inputNumbers, getSolution().removeTriples(inputNumbers)));
    }
}