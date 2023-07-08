https://www.codingninjas.com/studio/problems/introduction-to-linked-list_8144737?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

public class Solution {
    public static Node constructLL(int []arr) {
        Node head;
        
        Node firstNode = new Node(arr[0]);
        head = firstNode;
    
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        for (int i=1; i<arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

}
