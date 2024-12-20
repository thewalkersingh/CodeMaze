package LinkedList;
public class Odd_even_linked_list {
	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(5);
		ListNode l4 = new ListNode(6);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(7);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		System.out.println(l2.val);
		System.out.println(l2.next.val);
		System.out.println(head.next.next.val);
		ListNode ans = oddEvenList(head);
		while (ans.next != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
	
	public static ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}