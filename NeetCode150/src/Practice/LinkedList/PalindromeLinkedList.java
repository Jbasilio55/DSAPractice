package Practice.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 234. Palindrome Linked List - Easy
public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        fast = head;
        ListNode prev = null;
        ListNode curr = slow;
        ListNode nextNode = null;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        while(prev != null){
            if(fast.val != prev.val) return false;
            prev = prev.next;
            fast = fast.next;
        }
        return true;
    }

    //Brute Force array list approach
    public boolean isPalindrome2(ListNode head) {
        //if head is null return false
        if(head == null){
            return false;
        }
        //if head is a single node return true
        if(head.next == null){
            return true;
        }
        //make array list
        List<Integer> list = new ArrayList<>();
        //add all values from linked list to array list
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        // iterate through half the list and check if start -> mid == end -> mid
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    //Brute Force - stack approach
    public boolean isPalindrome3(ListNode head) {
        // if head is null return false
        if (head == null) {
            return false;
        }
        // if head is a single node return true
        if (head.next == null) {
            return true;
        }

        // make a stack to store the first half values
        Stack<Integer> stack = new Stack<>();
        ListNode mid = head;
        ListNode fast = head;

        // Move through the list with two pointers, pushing the first half of values onto the stack
        while (fast != null && fast.next != null) {
            stack.push(mid.val);
            mid = mid.next;
            fast = fast.next.next;
        }

        // If the list has an odd number of elements, skip the middle element
        if (fast != null) {
            mid = mid.next;
        }

        // Compare the second half of the list with the values in the stack
        while (mid != null) {
            if (mid.val != stack.pop()) {
                return false;
            }
            mid = mid.next;
        }
        return true;
    }

}
