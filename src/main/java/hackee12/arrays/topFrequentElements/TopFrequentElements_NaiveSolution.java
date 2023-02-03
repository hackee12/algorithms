package hackee12.arrays.topFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopFrequentElements_NaiveSolution {
    public int[] topKFrequent(int[] nums, int k) {
        final HashMap<Integer, Integer> frequents = new HashMap<>();
        for (int num : nums) {
            frequents.putIfAbsent(num, 0);
            frequents.put(num, 1 + frequents.get(num));
        }
        final List<Map.Entry<Integer, Integer>> tops = new ArrayList<>(frequents.entrySet());
        tops.sort(Map.Entry.comparingByValue());
        final int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = tops.get(tops.size() - 1 - i).getKey();
        }
        return arr;
    }
}
