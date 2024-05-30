package Practice.LinkedList;

// #83. Remove Duplicates from Sorted List - Easy

public class RemoveDuplicatesFromSL {
     //Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     //code for leetcode
    public static ListNode deleteDuplicates(ListNode head) {
         if(head == null){
             return head;
         }

         ListNode node = head;

         while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
         }
         return head;
    }
}
