package hackee12.misc.twoStringArraysEquivalence;

public class NaiveSolution implements Solution {

    @Override
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length;
        int m = word2.length;
        int i = 0, j = 0, p = 0, q = 0;
        while (i < n && p < m) {
            char ch1, ch2;
            if (j == word1[i].length()) {
                j = 0;
                i++;
            }
            if (q == word2[p].length()) {
                q = 0;
                p++;
            }
            if (i == n && p != m) return false;
            if (i != n && p == m) return false;
            if (i == n) return true;
            ch1 = word1[i].charAt(j++);
            ch2 = word2[p].charAt(q++);
            if (ch1 != ch2) return false;
        }
        throw new IllegalStateException();
    }
}
