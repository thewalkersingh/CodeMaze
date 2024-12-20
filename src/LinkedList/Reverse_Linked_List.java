package LinkedList;
public class Reverse_Linked_List {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(5);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		ListNode ans = reverseList(head);
		while (ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode next;
		ListNode curr = head;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}