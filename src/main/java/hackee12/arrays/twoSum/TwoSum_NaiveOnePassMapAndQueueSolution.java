package hackee12.arrays.twoSum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Return an array [i1, i2] so that numbers[i1] + numbers[i2] == twoSum.
 * Assume there always is one solution.
 * Examples: twoSum([1,2,3], 3) -> [0,1]; twoSum([1,1], 2) -> [0,1].
 */
public class TwoSum_NaiveOnePassMapAndQueueSolution implements TwoSum_Problem {
    @Override
    public int[] twoSum(int[] numbers, int twoSum) {
        Map<Integer, Queue<Integer>> num2i = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            num2i.putIfAbsent(numbers[i], new LinkedList<>());
            num2i.get(numbers[i]).add(i);
            final int delta = twoSum - numbers[i];
            if (num2i.containsKey(delta) && (delta != numbers[i] || num2i.get(delta).size() > 1)) {
                return new int[]{num2i.get(numbers[i]).remove(), num2i.get(delta).remove()};
            }
        }
        throw new IllegalArgumentException();
    }

    private int[] onePassMapSolution(int[] numbers, int twoSum) {
        Map<Integer, Integer> num2i = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            final int delta = twoSum - numbers[i];
            if (num2i.containsKey(delta)) {
                return new int[]{num2i.get(delta), i};
            }
            num2i.put(numbers[i], i);
        }
        throw new IllegalArgumentException();
    }
}
