package hackee12.linkedList.delete_nodes_having_duplicates;

import hackee12.linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveSolutionTest {

    private static final RecursiveSolution SOLUTION = new RecursiveSolution();

    @Test
    public void testSolution() {
        assertNull(SOLUTION.deleteDuplicates(null));
        assertEquals(new ListNode(1), SOLUTION.deleteDuplicates(new ListNode(1)));
        assertNull(SOLUTION.deleteDuplicates(new ListNode(1, new ListNode(1))));
        assertEquals(
                new ListNode(2),
                SOLUTION.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
        assertEquals(
                new ListNode(1),
                SOLUTION.deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2)))));
        assertEquals(
                new ListNode(1, new ListNode(3)),
                SOLUTION.deleteDuplicates(
                        new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))))));
    }
}