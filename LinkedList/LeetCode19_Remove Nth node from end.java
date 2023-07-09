https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        length = length-n;
        if (length == 0) {
            return head.next;
        }
        while (length-1 > 0) {
            temp = temp.next;
            length--;
        }
        temp.next = temp.next.next;
        return head;
    }
}
