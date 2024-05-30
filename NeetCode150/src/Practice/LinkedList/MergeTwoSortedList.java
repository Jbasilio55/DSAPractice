package Practice.LinkedList;

public class MergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode completeList = new ListNode();

        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                completeList.val = node1.val;
                node1 = node1.next;
            }else{
                completeList.val = node2.val;
                node2 = node2.next;
            }
            completeList = completeList.next;
        }

        while(node1 != null){
            completeList.val = node1.val;
            node1 = node1.next;
            completeList = completeList.next;
        }
        while(node2 != null){
            completeList.val = node2.val;
            node2 = node2.next;
            completeList = completeList.next;
        }

        return completeList;
    }
}
