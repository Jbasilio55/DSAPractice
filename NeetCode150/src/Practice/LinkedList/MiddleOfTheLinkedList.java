package Practice.LinkedList;
//876. Middle of the Linked List - easy
public class MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        //Move fast pointer twice as fast as slow pointer
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // when fast pointer reaches the end, slow pointer will be at the middle
        return slow;
    }
    //brute force approach
    public ListNode middleNode2(ListNode head) {
        ListNode node = head; //make a new node starting at head
        int count = 0; // count = 0

        while(node != null){ // iterate through linked list until null
            count++; // count + 1
            node = node.next; // move to next node
        }

        int middleIndex = count / 2; // count / 2

        for(int i = 0; i < middleIndex; i++){ // iterate through list again but half the distance
            head = head.next; // move to next
        }
        return head; //return head;
    }
}
