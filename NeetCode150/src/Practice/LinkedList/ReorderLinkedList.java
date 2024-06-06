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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find the middle of the list
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // 2. Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slowPtr;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Now, prev is the head of the reversed second half
        ListNode secondHalf = prev;

        // 3. Merge the two halves
        ListNode firstHalf = head;
        ListNode temp1, temp2;

        while (secondHalf.next != null) {
            temp1 = firstHalf.next;
            temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
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
