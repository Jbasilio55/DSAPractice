package Practice.LinkedList;

//92. Reverse Linked List II - Medium

public class ReverseLinkedListII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //create a dummy node to mark the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // make markers for current node and for the node before reversing
        ListNode leftPre = dummy;
        ListNode currNode = head;

        for(int i = 0; i < left -1; i++){
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        // make a marker to node where we start reversing
        ListNode subListHead = currNode;

        ListNode preNode = null;
        for(int i = 0; i < right - left + 1; i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        //Join the pieces
        leftPre.next = preNode;
        subListHead.next = currNode;
        return dummy.next;
    }
}
