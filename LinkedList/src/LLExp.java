import java.util.Arrays;

public class LLExp {
    public LLExp() {}

    private class LinkList {
        private Node head;
        private Node tail;
        private int size;

        public LinkList() {
            head = null;
            tail = null;
        }

        // Add node to the front
        public void addFirst(int item) {
            Node node = new Node(item);
            if (head == null) {
                head = tail = node;
            } else {
                node.next = head;
                head = node;
            }
            size++;
        }

        // Add node to the end
        public void addLast(int item) {
            Node node = new Node(item);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        //find index of given value
        public int indexOf(int item){
            var current = head;
            int index = -0;

            while(current != null){
                if(current.val == item){
                    return index;
                }else{
                    current = current.next;
                    index++;
                }
            }
            return -1;
        }

        //check if linked list contains a number
        public int contains(int num){
            Node current  = head;
            int index = 0;

            while(current != null){
                if(current.val == num){
                    return index;
                }else{
                    current = current.next;
                    index++;
                }
            }
            return -1;
        }

        //remove first node
        public void removeFirst(){
            if(head == tail){
                head = tail = null;
                return;
            }else{
                Node second = head.next;
                head.next = null;
                head = second;
            }

            size--;
        }

        //remove last node
        public void removeLast(){

            if(head == tail){
                head = tail = null;
                return;
            }else{
                var previous = getPrevious(tail);
                tail = previous;
                tail.next = null;
            }

            size--;

        }

        // get previous node
        private Node getPrevious(Node node){
            Node current = head;

            while(current != null){
                if(current.next == node) return current;

                current = current.next;

            }
            return null;
        }

        // print size of the linked list
        public int size(){
            return size;
        }

        private class Node {
            private int val;
            private Node next;

            public Node(int val) {
                this.val = val;
                this.next = null;  // Make sure to initialize 'next'
            }

            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }

        public int[] toArray(){
            var current = head;
            int[] arr = new int[size];

            for(int i = 0; i < size; i++){
                arr[i] = current.val;
                current = current.next;
            }
            return arr;
        }

        public void reverse(){
            if(head == null) return;

            Node prev = head;
            Node current = head.next;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            tail = head;
            tail.next = null;
            head = prev;
        }

    }

    public static void main(String[] args) {
        LLExp llExp = new LLExp();  // Create an instance of LLExp
        LinkList list = llExp.new LinkList();  // Use the instance to create LinkList

        // Adding nodes to the list
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Optionally, add to the front and see how the list behaves
        list.addFirst(5);
        list.removeFirst();

        // Traverse the list (for debugging purposes)
        LinkList.Node current = list.head;
        System.out.print("head -> ");
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("tail");
        // -----------------------------

        System.out.println(list.size());
        System.out.println();
        System.out.println(list.indexOf(10));

        list.reverse();

        System.out.println(Arrays.toString(list.toArray()));
    }
}


