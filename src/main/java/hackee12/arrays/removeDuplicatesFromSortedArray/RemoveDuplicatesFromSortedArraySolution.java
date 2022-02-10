package hackee12.arrays.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArraySolution implements RemoveDuplicatesFromSortedArray{
    @Override
    public int removeDuplicates(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input is null.");
        }
        if (numbers.length < 2) {
            return numbers.length;
        }
        int next = 1;
        for (int current = 1; current < numbers.length; current++) {
            if (numbers[current-1] != numbers[current]) {
                numbers[next++] = numbers[current];
            }
        }
        return next;
    }
}
