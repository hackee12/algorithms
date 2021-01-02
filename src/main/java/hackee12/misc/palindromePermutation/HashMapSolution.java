package hackee12.misc.palindromePermutation;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {

    public boolean canPermutePalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("String argument must not be null.");
        if (s.length() <= 1) return true;
        Map<Character, Integer> chTimes = new HashMap<>();
        for (char ch : s.toCharArray()) {
            chTimes.putIfAbsent(ch, 0);
            chTimes.put(ch, chTimes.get(ch) + 1);
        }
        int numOdd = 0;
        for (Map.Entry<Character, Integer> che : chTimes.entrySet()) {
            if (isOdd(che.getValue())) numOdd++;
        }
        if (isOdd(s.length())) {
            return numOdd == 1;
        }
        return numOdd == 0;
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }

    private boolean isOdd(int i) {
        return !isEven(i);
    }
}
