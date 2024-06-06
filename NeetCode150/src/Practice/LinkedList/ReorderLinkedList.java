package Practice.LinkedList;

//143. Reorder List - Medium

import java.util.ArrayList;
import java.util.List;

public class ReorderLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void reorderList(ListNode head) {
        // Edge cases
        if (head == null || head.next == null) {
            return;
        }

        // Find the middle of the linked list using the fast and slow pointer technique
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null, curr = slow, nextNode = null;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Merge the two halves
        ListNode first = head, second = prev;

        while (second.next != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }

    //Brute Force
    public static void reorderList2(ListNode head) {
        if (head == null) {
            return;
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> complete = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int last = list.size() - 1;

        for(int i = 0; i < list.size() / 2; i++){
            complete.add(list.get(i));
            complete.add(list.get(last - i));
        }

        if(list.size() % 2 == 1){
            complete.add(list.get(list.size() / 2));
        }
        System.out.println(complete);
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        reorderList2(node1);
    }
}
