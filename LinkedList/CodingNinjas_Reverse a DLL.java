https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1


public class Solution
{
    public static Node reverseDLL(Node head)
    {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }

        return prev;
    }
}
