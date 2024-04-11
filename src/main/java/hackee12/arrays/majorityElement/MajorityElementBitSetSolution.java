package hackee12.arrays.majorityElement;

public class MajorityElementBitSetSolution implements MajorityElementProblem {
    @Override
    public int majorityElement(int[] nums) {
        int major = 0;
        for (int bit = 0; bit < 32; bit++) {
            int bitCount = 0;
            for (int num : nums) {
                if (0 != (num & 1 << bit)) {
                    bitCount++;
                }
            }
            if (bitCount > nums.length / 2) {
                major |= 1 << bit;
            }
        }
        return major;
    }
}
