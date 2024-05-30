package Practice.LinkedList;

public class LengthOfLLCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int lengthCycle(ListNode head) {
        // slow and fast pointers start at head
        ListNode slow = head;
        ListNode fast = head;

        // iterate through both linked list, if either is null then it is not a valid circular LL
        while(fast != null && fast.next != null){
            // slow + 1
            // fast + 2
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                //calculate length
                ListNode temp = slow;
                int length = 0;
                //iterate once around the circle
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}
