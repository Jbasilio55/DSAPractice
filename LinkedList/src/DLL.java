public class DLL {
    private Node head;

    public DLL(){

    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if(head == null){
            head = node;
            node.prev = null;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node prevNode = head;

        for(int i = 0; i < index; i++){
            prevNode = prevNode.next;
        }

        node.next = prevNode.next;
        prevNode.next.prev = node;
        prevNode.next = node;
        node.prev = prevNode;
    }

    public void insertAfterValue(int after, int val){
        Node prevNode = find(after);

        if(prevNode == null){
            System.out.println("Value is not exist");
            return;
        }

        Node node = new Node(val);
        node.next = prevNode.next;
        prevNode.next = node;
        node.prev = prevNode;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node = head;

        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
