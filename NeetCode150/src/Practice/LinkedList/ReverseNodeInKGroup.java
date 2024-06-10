package Practice.LinkedList;

// 25. Reverse Nodes in k-Group - Hard

import java.util.Stack;

public class ReverseNodeInKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode ans = new ListNode(0);
        ans.next = head;

        ListNode prev = ans, curr = ans, nex = ans;
        int total = 0;

        while (curr.next != null) {
            total++;
            curr = curr.next;
        }

        while (total >= k) {
            curr = prev.next;
            nex = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }

            total -= k;
            prev = curr;
        }

        return ans.next;
    }

    // brute force using stacks
    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        Stack<ListNode> st = new Stack<>();

        dummy.next = head;
        ListNode pre = dummy ;
        ListNode temp = head;

        while(temp!=null){
            int count = 0;
            ListNode curr = temp;
            while(count<k&&temp!=null){
                st.push(temp);
                temp = temp.next;
                count++;
            }
            if(count==k){
                while(!st.isEmpty()){
                    pre.next = st.pop();
                    pre = pre.next;
                }
                pre.next = temp;
            }else{
                pre.next = curr;
            }
        }
        return dummy.next;
    }
}
