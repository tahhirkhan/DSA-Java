https://leetcode.com/problems/reorder-list/description/

class Solution {
	public void reorderList(ListNode head) {
		ListNode mid = middleNode(head);
		ListNode h1 = head;
		ListNode h2 = reverse(mid);
		while (h1 != null && h2 != null) {
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
	public static ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode curr = node;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
