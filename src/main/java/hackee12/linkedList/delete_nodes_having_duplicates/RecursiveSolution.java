package hackee12.linkedList.delete_nodes_having_duplicates;

import hackee12.linkedList.ListNode;

import java.util.Objects;

public class RecursiveSolution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.val == head.next.val) {
            head = trimLeadingDuplicates(head);
            return deleteDuplicates(head.next);
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }

    private ListNode trimLeadingDuplicates(ListNode head) {
        Objects.requireNonNull(head);
        while (head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        return head;
    }
}
