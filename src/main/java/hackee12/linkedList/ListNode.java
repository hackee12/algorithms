package hackee12.linkedList;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public int hashCode() {
        return val + (next == null ? 0 : next.val);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof ListNode) {
            ListNode otherNode = (ListNode) other;
            if (this.val != otherNode.val) return false;
            if (this.next == otherNode.next) return true;
            return this.next != null && this.next.equals(otherNode.next);
        }
        return false;
    }
}
