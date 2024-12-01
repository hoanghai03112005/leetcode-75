package leetcode_75;

public class _2095 {
	
	public static ListNode deleteMiddle(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        ListNode curr = head;
        
        if (head == null || head.next == null) {
			return null;
		}
        
        while (right != null && right.next != null) {
			left = left.next;
			right = right.next.next;
		}
        
        while (curr != null) {
			if (curr.next == left) {
				curr.next = curr.next.next;
				break;
			} else {
				curr = curr.next;
			}
		}
        return head;
    }
	
	
}
