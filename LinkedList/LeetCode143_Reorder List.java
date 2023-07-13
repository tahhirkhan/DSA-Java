https://leetcode.com/problems/reorder-list/description/

class Solution {
    public void reorderList(ListNode head) {
        ListNode mid = midNode(head);

        // Reverse the second half of the list:
        ListNode prev = null;
        ListNode curr = mid;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Now:
        ListNode h1 = head;
        ListNode h2 = prev;
        while (h1 != null && h2 != null) {
            // ListNode temp1 = h1.next;
            // h1.next = h2;
            // h1 = temp1;

            // temp1 = h2.next;
            // h2.next = h1;
            // h2 = temp1;

            ListNode temp1 = h1.next;
            ListNode temp2 = h2.next;
            h1.next = h2;
            h2.next = temp1;
            h1 = temp1;
            h2 = temp2;
        }
        if (h1 != null) {
            h1.next = null;
        }
    }
    // Find middle node of a linked list:
    private ListNode midNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
