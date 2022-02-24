package hackee12.arrays.removeTriplesFromSorted;

import org.junit.runners.Parameterized;

public class RemoveTriplesFromSortedNaiveSolutionTest extends RemoveTriplesFromSortedTest {

    public static final RemoveTriplesFromSortedNaiveSolution SOLUTION = new RemoveTriplesFromSortedNaiveSolution();

    @Parameterized.Parameters
    public static Object[][] parameters() {
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
                        new int[]{0, 0}
                },
                {
                        new int[]{0, 0, 0},
                        new int[]{0, 0}
                },
                {
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0}
                },
                {
                        new int[]{0, 0, 0, 1},
                        new int[]{0, 0, 1}
                },
                {
                        new int[]{0, 1, 1, 1},
                        new int[]{0, 1, 1}
                },
                {
                        new int[]{0, 1, 1, 1, 2},
                        new int[]{0, 1, 1, 2}
                },
                {
                        new int[]{0, 1, 1, 1, 2, 2},
                        new int[]{0, 1, 1, 2, 2}
                },
                {
                        new int[]{0, 1, 2, 3},
                        new int[]{0, 1, 2, 3}
                },
        };
    }

    @Override
    public RemoveTriplesFromSorted getSolution() {
        return SOLUTION;
    }
}
