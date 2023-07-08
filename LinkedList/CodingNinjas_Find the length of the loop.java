https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

public class Solution
{
    public static int lengthOfLoop(Node head) {
        if (head == null) {
            return 0;
        }
        int length = 0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = slow.next;
                length++;
                while (slow != fast) {
                    slow = slow.next;
                    length++;
                }
                break;
            }
        }
        return length;
    }
}
