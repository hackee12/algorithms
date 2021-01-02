package hackee12.misc.palindromePermutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapSolutionTest {

    @Test
    public void test() {
        HashMapSolution pps = new HashMapSolution();

        assertFalse(pps.canPermutePalindrome("code"));
        assertTrue(pps.canPermutePalindrome("aab"));
        assertTrue(pps.canPermutePalindrome("carerac"));

        assertFalse(pps.canPermutePalindrome("ab"));
        assertFalse(pps.canPermutePalindrome("abc"));
        assertFalse(pps.canPermutePalindrome("abcd"));
        assertFalse(pps.canPermutePalindrome("ababab"));
        assertFalse(pps.canPermutePalindrome("ababcd"));
        assertFalse(pps.canPermutePalindrome("ababcde"));
        assertFalse(pps.canPermutePalindrome("ababcdeff"));

        assertTrue(pps.canPermutePalindrome(""));
        assertTrue(pps.canPermutePalindrome("a"));
        assertTrue(pps.canPermutePalindrome("aa"));
        assertTrue(pps.canPermutePalindrome("aaa"));
        assertTrue(pps.canPermutePalindrome("aba"));
        assertTrue(pps.canPermutePalindrome("abab"));
        assertTrue(pps.canPermutePalindrome("ababa"));
        assertTrue(pps.canPermutePalindrome("abcab"));
    }

}