https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            head = null;
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        int newLength = length/2;
        while (newLength-1 > 0) {
            temp = temp.next;
            newLength--;
        }
        temp.next = temp.next.next;
        return head;
    }
}
