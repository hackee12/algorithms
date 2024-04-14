package hackee12.arrays.mostFrequentEvenElement;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentEvenElement_Solution implements MostFrequentEvenElement_Problem {
    @Override
    public int mostFrequentEven(int[] nums) {
        // The constraints are small.
        // Straightforward counting is good enough.

        // Count how frequent every num occurs
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                map.put(n, 1 + map.getOrDefault(n, 0));
            }
        }

        // Invert map
        Map<Integer, Integer> invert = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, Math::min));

        // Get max from invert
        return invert.entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .orElse(-1);
    }
}
