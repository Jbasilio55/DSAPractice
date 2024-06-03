package Practice.LinkedList;

//206. Reverse Linked List

import java.util.Stack;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // Time O(n), Space O(n)
    public ListNode reverseList(ListNode head){
        //make 3 pointers - prev, curr, next
        ListNode prev = null, nextNode = null;
        ListNode curr = head;

        //iterate through list and stop if curr is null
        while(curr != null){
            nextNode = curr.next; //assign nextNode to curr.next
            curr.next = prev; // make curr.next point to prev
            prev = curr; // assign prev to curr
            curr = nextNode;// assign curr to nextNode
        }
        return prev; //return prev
    }
    //recursive option
    public ListNode reverseList2(ListNode head){
        //if list is empty return null
        if(head == null || head.next == null){
            return head;
        }

        ListNode reversedListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }

    //Brute force using a stack to store values // Time - O(n), Space O(n)
    public ListNode reverseList3(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            temp.val = stack.pop();
            temp = temp.next;
        }
        return temp;
    }
}
