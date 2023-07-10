https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    public ListNode middleNode(ListNode head) {
        // O(N) Solution:_______________

        // if (head == null) {
        //     return head;
        // }
        // ListNode temp = head;
        // int length = 0;
        // while (temp != null) {
        //     length++;
        //     temp = temp.next;
        // }
        // temp = head;
        // length = length/2;
        // while (length > 0) {
        //     temp = temp.next;
        //     length--;
        // }
        // return temp;


        // O(1) Solution:_______________
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
