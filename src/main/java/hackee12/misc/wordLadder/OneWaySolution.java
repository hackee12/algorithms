package hackee12.misc.wordLadder;

import java.util.*;

public class OneWaySolution implements Solution {

    @Override
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        if (!words.contains(endWord)) return 0;

        Deque<Set<String>> from = new ArrayDeque<>();
        Set<String> seen = new HashSet<>();
        from.addFirst(new HashSet<>(Collections.singletonList(beginWord)));
        seen.add(beginWord);

        while (!from.getFirst().isEmpty()) {

            HashSet<String> ff = new HashSet<>();
            for (String word : wordList) {
                for (String f : from.getFirst()) {
                    if (!seen.contains(word) && canMove(f, word)) {
                        ff.add(word);
                        seen.add(word);
                    }
                }
            }

//            System.out.println(ff);
            from.addFirst(ff);
            if (ff.contains(endWord)) break;
//            to.addFirst(tt);
        }
        return from.getFirst().isEmpty() ? 0 : from.size();
    }

    private boolean canMove(String from, String to) {
        int mismatch = 0;
        int i = 0;
        while (i < to.length() && mismatch < 2) {
            if (from.charAt(i) != to.charAt(i)) {
                mismatch++;
            }
            i++;
        }
        return mismatch == 1;
    }

}
