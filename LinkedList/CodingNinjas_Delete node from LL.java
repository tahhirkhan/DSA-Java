https://www.codingninjas.com/studio/problems/delete-node-in-ll_5881

public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// calculate length:
		Node<Integer> temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		if (pos == 0 && head != null) {
			return head.next;
		}
		if (pos >= length) {
			return head;
		}
		temp = head;
		while (pos-1 > 0) {
			temp = temp.next;
			pos--;
		}
		temp.next = temp.next.next;

		return head;
	}
