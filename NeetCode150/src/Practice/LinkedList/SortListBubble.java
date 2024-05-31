package Practice.LinkedList;
//148. Sort List - Medium (Bubble sort)
public class SortListBubble {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        ListNode current;

        do {
            swapped = false;
            current = head;

            while (current != null && current.next != null) {
                if (current.val > current.next.val) {
                    // Swap the values
                    int temp = current.val;
                    current.val = current.next.val;
                    current.next.val = temp;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(4, node2);

        SortListBubble solution = new SortListBubble();
        System.out.println("Original List:");
        printList(node1);

        ListNode sortedHead = solution.sortList(node1);
        System.out.println("Sorted List:");
        printList(sortedHead);
    }
}
