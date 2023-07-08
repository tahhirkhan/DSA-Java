https://www.codingninjas.com/studio/problems/search-in-a-linked-list_975381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

public class Solution
{
    public static int searchInLinkedList(Node head, int k) {

        if (head == null) {
            return 0;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}
