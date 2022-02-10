package hackee12.arrays.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayNaiveSolution implements RemoveDuplicatesFromSortedArray {
    @Override
    public int removeDuplicates(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input is null.");
        }
        if (numbers.length < 2) {
            return numbers.length;
        }
        int i = 1;
        for (int j = 1; j < numbers.length; j++) {
            while (j < numbers.length && numbers[j - 1] == numbers[j]) {
                j++;
            }
            if (j < numbers.length) {
                numbers[i] = numbers[j];
                i++;
            }
        }
        return i;
    }
}
