package hackee12.arrays.topFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopFrequentElements_ProvidedSolution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }
        final Map<Integer, Integer> numToCounts = new HashMap<>();
        for (int num : nums) {
            numToCounts.put(num, 1 + numToCounts.getOrDefault(num, 0));
        }
        final Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Map.Entry.comparingByValue());
        heap.addAll(numToCounts.entrySet());
        while (heap.size() > k) {
            heap.poll();
        }
        return heap.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
