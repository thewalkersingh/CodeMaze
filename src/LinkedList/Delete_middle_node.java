package LinkedList;
public class Delete_middle_node {
	public static void main(String[] args) {
		int[] inp = {1, 3, 4, 7, 1, 2, 6};
		ListNode listNode = new ListNode(1);
		ListNode listNode1 = new ListNode(3);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(7);
		ListNode listNode4 = new ListNode(1);
		ListNode listNode5 = new ListNode(2);
		ListNode listNode6 = new ListNode(6);
		listNode.next = listNode1;
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		System.out.println(listNode.next.next.val);
		ListNode ans = deleteMiddle(listNode);
		System.out.println(ans.toString());
	}
	
	public static ListNode deleteMiddle(ListNode head) {
		ListNode slow = head, fast = head, prev = null;
		// edge cases
		if (head == null || head.next == null)
			return null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		return head;
	}
}