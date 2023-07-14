https://www.codingninjas.com/studio/problems/interview-shuriken-42-detect-and-remove-loop_241049?leftPanelTab=0

public class Solution {
  public static Node removeLoop(Node head) {
      int length = lengthOfLoop(head);
      if (length < 1) {
        return head;
      }
      Node prev = null;
      Node first = head;
      Node second = head;
      while (length > 0) {
        prev = second;
        second = second.next;
        length--;
      }
      while (first != second) {
        prev = second;
        first = first.next;
        second = second.next;
      }
      prev.next = null;
      return head;
  }
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
