package hackee12.arrays.findSingleNumber;

import hackee12.MySolution;

import java.util.HashSet;
import java.util.Set;

public class FindSingleNumber_SetSolution implements FindSingleNumberProblem, MySolution {
    @Override
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            boolean add = set.add(n);
            if (!add) set.remove(n);
        }
        return set.iterator().next();
    }
}
