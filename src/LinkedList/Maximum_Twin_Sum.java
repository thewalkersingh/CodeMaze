package LinkedList;
import java.util.ArrayList;

public class Maximum_Twin_Sum {
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(7);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		System.out.println("Max sum is: " + pairSumBetter(head));
	}
	
	public static int pairSum(ListNode head) {
		ArrayList<Integer> list = new ArrayList<>();
		
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int max = list.get(0) + list.getLast();
		// for debugging
		for (int i : list)
			System.out.print(i + " ");
		if (list.size() == 2) {
			return list.get(0) + list.get(1);
		}
		System.out.println();
		for (int i = 0; i < list.size() - 1; i++) {
			int j = list.size() - 1 - i;
			int value = list.get(i) + list.get(j);
			System.out.println("Value: " + value);
			max = Math.max(value, max);
		}
		return max;
	}
	
	public static int pairSumBetter(ListNode head) {
		if (head == null) {
			return 0;
		}
		// Find the middle of the linked list
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// Reverse the second half of the list
		ListNode prev = null;
		ListNode curr = slow;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		// Compare the values from the first half and the reversed second half
		int maxSum = 0;
		ListNode firstHalf = head;
		ListNode secondHalf = prev;
		while (secondHalf != null) {
			maxSum = Math.max(maxSum, firstHalf.val + secondHalf.val);
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}
		return maxSum;
	}
}