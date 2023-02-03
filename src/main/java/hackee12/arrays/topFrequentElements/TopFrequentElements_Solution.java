package hackee12.arrays.topFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopFrequentElements_Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }

        final Map<Integer, Integer> numToCounts = new HashMap<>();
        for (int num : nums) {
            numToCounts.put(num, 1 + numToCounts.getOrDefault(num, 0));
        }
        final Queue<Map.Entry<Integer, Integer>> numToCountsHeap = new PriorityQueue<>(Map.Entry.comparingByValue());
        numToCounts.entrySet().forEach(numToCount -> {
            numToCountsHeap.add(numToCount);
            if (numToCountsHeap.size() > k) {
                numToCountsHeap.poll();
            }
        });
        return numToCountsHeap.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
