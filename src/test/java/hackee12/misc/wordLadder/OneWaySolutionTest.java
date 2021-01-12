package hackee12.misc.wordLadder;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class OneWaySolutionTest {

    @Test(timeout = 1000)
    public void testLadderLength() {
        OneWaySolution solution = new OneWaySolution();

        assertEquals(0, solution.ladderLength("hit", "cog", Arrays.asList("hog")));
        assertEquals(0, solution.ladderLength("hit", "cog", Arrays.asList("hot", "hog")));
        assertEquals(0, solution.ladderLength("hit", "cog",
                Arrays.asList("hot", "dot", "dog", "lot", "log")));
        assertEquals(0, solution.ladderLength("hit", "cog",
                Arrays.asList("hot","dot","tog","cog")));

        assertEquals(4, solution.ladderLength("hit", "cog",
                Arrays.asList("hot", "hog", "cog")));
        assertEquals(4, solution.
                ladderLength("hit", "cog",
                        Arrays.asList("hot", "dot", "cig", "dog", "cit", "lot", "log", "cog")));
        assertEquals(5, solution.
                ladderLength("hit", "cog",
                        Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
    }
}