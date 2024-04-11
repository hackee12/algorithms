package hackee12.arrays.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementNaiveMapSolution implements MajorityElementProblem{
    @Override
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0)  +1 );
            if (counts.get(num) > nums.length / 2) {
                return num;
            }
        }
        throw new IllegalArgumentException("Majority element does not exist.");
    }
}
