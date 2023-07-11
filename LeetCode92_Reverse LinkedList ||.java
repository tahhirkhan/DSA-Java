https://leetcode.com/problems/reverse-linked-list-ii/description/

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        // Skip the left-1 nodes:
        ListNode prev = null;
        ListNode current = head;
        for (int i=0; current != null && i<left-1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode newEnd = current;
        ListNode A = prev;
        ListNode next = current.next;

        for (int i=0; current != null && i<(right-left+1); i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (A != null) {
            A.next = prev;
        }
        else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}
