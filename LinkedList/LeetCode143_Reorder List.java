https://leetcode.com/problems/reorder-list/description/

public class Solution {
	public static Node rearrangeList(Node head) {
		Node mid = middleNode(head);
		Node h1 = head;
		Node h2 = reverse(mid);
		while (h1 != null && h2 != null) {
			Node temp1 = h1.next;
			Node temp2 = h2.next;
			h1.next = h2;
			h2.next = temp1;
			h1 = temp1;
			h2 = temp2;
		}
		if (h1 != null) {
			h1.next = null;
		}
		return head;
	}
	public static Node middleNode(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static Node reverse(Node node) {
		Node prev = null;
		Node curr = node;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}







// class Solution {
//     public void reorderList(ListNode head) {
//         ListNode mid = midNode(head);

//         // Reverse the second half of the list:
//         ListNode prev = null;
//         ListNode curr = mid;
//         while (curr != null) {
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         // Now:
//         ListNode h1 = head;
//         ListNode h2 = prev;
//         while (h1 != null && h2 != null) {
//             // ListNode temp1 = h1.next;
//             // h1.next = h2;
//             // h1 = temp1;

//             // temp1 = h2.next;
//             // h2.next = h1;
//             // h2 = temp1;

//             ListNode temp1 = h1.next;
//             ListNode temp2 = h2.next;
//             h1.next = h2;
//             h2.next = temp1;
//             h1 = temp1;
//             h2 = temp2;
//         }
//         if (h1 != null) {
//             h1.next = null;
//         }
//     }
//     // Find middle node of a linked list:
//     private ListNode midNode(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//         }
//         return slow;
//     }
// }
