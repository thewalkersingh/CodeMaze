package LinkedList;
public class Rotate_List {
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
		ListNode ans = rotate(head, 2);
		while (ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}
	}
	
	public static ListNode rotate(ListNode head, int k) {
		// Write your code here.
		ListNode start = head;
		ListNode rot = head;
		int rotCount = 0;
		while (head.next != null) {
			head = head.next;
			if (rotCount < k) {
				rot = rot.next;
			}
		}
		head.next = start;
		return rot;
	}
}