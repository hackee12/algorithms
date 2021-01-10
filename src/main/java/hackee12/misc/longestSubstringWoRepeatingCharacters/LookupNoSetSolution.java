package hackee12.misc.longestSubstringWoRepeatingCharacters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LookupNoSetSolution implements Solution {

    // a
    // aa
    // ab
    // aba
    // abc
    // abcc
    // abca
    @Override
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        int[] lookup = new int[256];
        Arrays.fill(lookup, -1);

        int maxLength = 0;
        int subBegin = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lookup[currentChar] >= subBegin) {
                subBegin = lookup[currentChar] + 1;
            }
            int subEnd = i + 1;
            maxLength = Math.max(maxLength, subEnd - subBegin);
            lookup[currentChar] = i;
        }
        return maxLength;
    }
}
