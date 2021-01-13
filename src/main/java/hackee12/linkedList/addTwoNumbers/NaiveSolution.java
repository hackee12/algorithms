package hackee12.linkedList.addTwoNumbers;

import hackee12.linkedList.ListNode;

public class NaiveSolution implements Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode node = new ListNode();
        ListNode a = node;
        while (l1 != null && l2 != null) {
            int s = l1.val + l2.val + c;
            int d = s % 10;
            c = s / 10;
            node.next = new ListNode(d);
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }
        node.next = l1 == null ? passCarryBit(l2, c) : passCarryBit(l1, c);
        return a.next;
    }

    private ListNode passCarryBit(ListNode listNode, int carryBit) {
        if (listNode == null) {
            if (carryBit == 0) return listNode;
            return new ListNode(carryBit);
        }
        int c = carryBit;
        ListNode node = new ListNode();
        ListNode a = node;
        node.next = listNode;
        while (node.next != null) {
            int s = c + node.next.val;
            int d = s % 10;
            c = s / 10;
            node.next.val = d;
            node = node.next;
        }
        if (c > 0) node.next = new ListNode(c);
        return a.next;
    }
}
