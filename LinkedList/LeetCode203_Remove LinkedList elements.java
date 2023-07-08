https://leetcode.com/problems/remove-linked-list-elements/description/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode fakeHead = new ListNode();
        fakeHead.next = head;
        ListNode prev = fakeHead;

        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            }
            else {
                prev = prev.next;
            }
            head = head.next;
        }
        return fakeHead.next;
    }
}
