https://leetcode.com/problems/delete-node-in-a-linked-list/description/

// we delete the next nod instead of the current node,
// but we copy the data of the next node into the current node,
// as it is mentioned in the question that the data of the given node should not exist in the memeory,
// but the node itself can.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
