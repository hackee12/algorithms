package hackee12.misc.longestSubstringWoRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class NaiveSolution_ArrayInsteadMap implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] arr = s.toCharArray();
        int[] lookup = new int[256];
        Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            if (set.contains(currentChar)) {
                max = Math.max(max, end - start);
                int till = lookup[currentChar];
                for (int j = start; j < till; j++) {
                    char backChar = arr[j];
                    set.remove(backChar);
                }
                start = till + 1;
            }
            lookup[currentChar] = i;
            set.add(currentChar);
            end++;
        }
        return Math.max(max, end - start);
    }
}
