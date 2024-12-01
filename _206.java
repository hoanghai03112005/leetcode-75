package leetcode_75;

public class _206 {

	public ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		ListNode next;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;		
		}
		
		return prev;
	}
}
