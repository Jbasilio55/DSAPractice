package Practice.LinkedList;

//142. Linked List Cycle II - Medium

import java.util.HashMap;

public class LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        int length = 0;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        while(f != s){
            f = f.next;
            s = s.next;
        }
        return f;
    }

    public int lengthCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    //reduce the space of algorithm by completing it in one method
    public ListNode detectCycle2(ListNode head){
        //Start both pointers at head
        ListNode slow = head, fast = head;

        // Move both pointers at different speed | Fast (+2), Slow (+1)
        //until they meet
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            //As soon as they meet, start from the head again and move at the same speed (+1)
            if(fast == slow){
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    // Brute force approach
    public ListNode detectCycle3(ListNode head){
        HashMap<ListNode, Integer> hash = new HashMap<>();
        ListNode node = head;

        while(node != null){
            if(!hash.containsKey(node)){
                hash.put(node, 1);
                node = node.next;
            }else{
                return node;
            }
        }
        return null;
    }
}
