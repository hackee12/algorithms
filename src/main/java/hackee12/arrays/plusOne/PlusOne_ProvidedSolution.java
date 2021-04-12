package hackee12.arrays.plusOne;

public class PlusOne_ProvidedSolution implements PlusOne_Problem {

    @Override
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            // set all the nines at the end of array to zeros
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            // here we have the rightmost not-nine
            else {
                // increase this rightmost not-nine by 1
                digits[i]++;
                // and the job is done
                return digits;
            }
        }
        // we're here because all the digits are nines
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
