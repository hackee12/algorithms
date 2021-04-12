package hackee12.arrays.plusOne;

import hackee12.MySolution;

import java.util.Arrays;

public class PlusOne_Solution implements PlusOne_Problem, MySolution {

    @Override
    public int[] plusOne(int[] digits) {
        int[] plusOne = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int s = carry + digits[i];
            plusOne[i + 1] = s % 10;
            carry = s / 10;
        }
        plusOne[0] = carry;
        int shift = 0;
        while (plusOne[shift] == 0) shift++;
        return Arrays.copyOfRange(plusOne, shift, plusOne.length);
    }
}
