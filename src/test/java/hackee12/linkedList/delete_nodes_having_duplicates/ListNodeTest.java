package hackee12.linkedList.delete_nodes_having_duplicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void testEquals() {
        assertNotEquals(null, new ListNode());
        assertEquals(new ListNode(1), new ListNode(1));
        assertNotEquals(new ListNode(1), new ListNode(1, new ListNode(1)));
        assertNotEquals(new ListNode(1, new ListNode(1)), new ListNode(1));
        assertEquals(new ListNode(1, new ListNode(1)), new ListNode(1, new ListNode(1)));
    }

}