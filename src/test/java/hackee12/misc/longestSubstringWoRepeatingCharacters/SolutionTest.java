package hackee12.misc.longestSubstringWoRepeatingCharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test() {
        Solution[] solutions = {
                new NaiveSolution(),
                new NaiveSolution_ArrayInsteadMap(),
                new LookupNoSetSolution(),
        };
        for (Solution solution : solutions) {
            assertEquals(0, solution.lengthOfLongestSubstring(null));
            assertEquals(0, solution.lengthOfLongestSubstring(""));
            assertEquals(1, solution.lengthOfLongestSubstring("a"));
            assertEquals(1, solution.lengthOfLongestSubstring("aa"));
            assertEquals(2, solution.lengthOfLongestSubstring("ab"));
            assertEquals(3, solution.lengthOfLongestSubstring("abc"));
            assertEquals(3, solution.lengthOfLongestSubstring("abcc"));
            assertEquals(3, solution.lengthOfLongestSubstring("abca"));
            assertEquals(3, solution.lengthOfLongestSubstring("abcb"));
            assertEquals(3, solution.lengthOfLongestSubstring("abcc"));
            assertEquals(7, solution.lengthOfLongestSubstring("defabcfdeg"));
        }

    }
}