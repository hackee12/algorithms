package hackee12.arrays.removeTriplesFromSorted;

public class RemoveTriplesFromSortedNaiveSolution implements RemoveTriplesFromSorted {
    @Override
    public int removeTriples(int[] numbers) {
        if (numbers.length < 3) {
            return numbers.length;
        }
        int nextInsert = 1;
        for (int i = 1, duplicates = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                duplicates++;
            } else {
                duplicates = 0;
            }
            if (duplicates < 2) {
                numbers[nextInsert++] = numbers[i];
            }
        }
        return nextInsert;
    }
}
