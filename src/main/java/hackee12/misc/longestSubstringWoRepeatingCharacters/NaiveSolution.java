package hackee12.misc.longestSubstringWoRepeatingCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NaiveSolution implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (set.contains(ch)) {
                max = Math.max(max, end - start);
                int till = map.get(ch);
                for (int j = start; j < till; j++) {
                    set.remove(arr[j]);
                }
                start = till + 1;
            }
            map.put(ch, i);
            set.add(ch);
            end++;
        }
        return Math.max(max, end - start);
    }
}
