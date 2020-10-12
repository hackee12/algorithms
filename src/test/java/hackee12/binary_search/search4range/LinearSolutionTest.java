package hackee12.binary_search.search4range;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LinearSolutionTest {

    private static final LinearSolution SOLUTION = new LinearSolution();
    private static final int[] NOT_FOUND = {-1, -1};

    @Test
    public void notFound() {
        assertArrayEquals("empty input", NOT_FOUND, SOLUTION.searchRange(new int[0], 1));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1}, 0));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1}, 2));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1,2}, 3));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1,3}, 2));
    }

    @Test
    public void success() {
        assertArrayEquals("start", new int[]{0,0}, SOLUTION.searchRange(new int[]{1}, 1));
        assertArrayEquals("start", new int[]{0,1}, SOLUTION.searchRange(new int[]{1,1}, 1));
        assertArrayEquals("start", new int[]{0,2}, SOLUTION.searchRange(new int[]{1,1,1}, 1));
        assertArrayEquals("start", new int[]{0,0}, SOLUTION.searchRange(new int[]{1,2,3}, 1));
        assertArrayEquals("end", new int[]{1,1}, SOLUTION.searchRange(new int[]{1,3}, 3));
        assertArrayEquals("end", new int[]{1,2}, SOLUTION.searchRange(new int[]{1,3,3}, 3));
        assertArrayEquals("end", new int[]{2,2}, SOLUTION.searchRange(new int[]{1,2,3}, 3));
        assertArrayEquals("end", new int[]{2,3}, SOLUTION.searchRange(new int[]{1,2,3,3}, 3));
        assertArrayEquals("end", new int[]{2,4}, SOLUTION.searchRange(new int[]{1,2,3,3,3}, 3));
    }

}