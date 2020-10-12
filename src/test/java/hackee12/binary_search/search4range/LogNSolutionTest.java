package hackee12.binary_search.search4range;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LogNSolutionTest {

    private static final LogNSolution SOLUTION = new LogNSolution();
    private static final int[] NOT_FOUND = {-1, -1};

    @Test
    public void notFound() {
        assertArrayEquals("empty input", NOT_FOUND, SOLUTION.searchRange(new int[0], 1));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1}, 0));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1}, 2));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1, 2}, 3));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1, 3}, 2));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{1, 2, 3}, 4));
        assertArrayEquals("no target", NOT_FOUND, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10}, 4));
    }

    @Test
    public void success() {
        assertArrayEquals("start", new int[]{0, 0}, SOLUTION.searchRange(new int[]{1}, 1));
        assertArrayEquals("start", new int[]{0, 1}, SOLUTION.searchRange(new int[]{1, 1}, 1));
        assertArrayEquals("start", new int[]{0, 2}, SOLUTION.searchRange(new int[]{1, 1, 1}, 1));
        assertArrayEquals("start", new int[]{0, 0}, SOLUTION.searchRange(new int[]{1, 2, 3}, 1));
        assertArrayEquals("start", new int[]{0, 1}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10}, 5));
        assertArrayEquals("end", new int[]{1, 1}, SOLUTION.searchRange(new int[]{1, 3}, 3));
        assertArrayEquals("end", new int[]{1, 2}, SOLUTION.searchRange(new int[]{1, 3, 3}, 3));
        assertArrayEquals("end", new int[]{2, 2}, SOLUTION.searchRange(new int[]{1, 2, 3}, 3));
        assertArrayEquals("end", new int[]{2, 3}, SOLUTION.searchRange(new int[]{1, 2, 3, 3}, 3));
        assertArrayEquals("end", new int[]{2, 4}, SOLUTION.searchRange(new int[]{1, 2, 3, 3, 3}, 3));
        assertArrayEquals("middle", new int[]{2, 2}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10}, 7));
        assertArrayEquals("middle", new int[]{3, 5}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10}, 8));
        assertArrayEquals("middle", new int[]{6, 6}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10}, 9));
        assertArrayEquals("middle", new int[]{6, 7}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 9, 10}, 9));
        assertArrayEquals("end", new int[]{7, 7}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10}, 10));
        assertArrayEquals("end", new int[]{7, 8}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10,10}, 10));
        assertArrayEquals("end", new int[]{7, 9}, SOLUTION.searchRange(new int[]{5, 5, 7, 8, 8, 8, 9, 10,10,10}, 10));
    }

}