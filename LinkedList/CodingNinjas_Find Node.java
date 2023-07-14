https://www.codingninjas.com/studio/problems/find-node_920443?leftPanelTab=0


public class Solution {
    public static ListNode findNode(ListNode head, int n) {
        int length = lengthOfLoop(head);
        if (length < 1) {
            return head;
        }
        ListNode first = head;
        ListNode second = head;
        while (length > 0) {
            second = second.next;
            length--;
        }
        int counter = 1;
        while (first != second) {
            counter++;
            first = first.next;
            second = second.next;
        }
        int positionOfNFromHead = counter - n;
        if (positionOfNFromHead < 1) {
            return null;
        }
        ListNode temp = head;
        while (positionOfNFromHead-1 > 0) {
            temp = temp.next;
            positionOfNFromHead--;
        }
        return temp;
    }

    public static int lengthOfLoop(ListNode head) {
        if (head == null) {
            return 0;
        }
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length++;
                slow = slow.next;
                while (fast != slow) {
                    slow = slow.next;
                    length++;
                }
                break;
            }
        }
        return length;
    }
}
