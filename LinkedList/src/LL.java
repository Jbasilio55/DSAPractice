public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size ++;
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst(){
       int value = head.value;
       head = head.next;

       if(head == null){
           tail = null;
       }

       size--;
       return value;
    }

    public int deleteLast(){
        int val = tail.value;
        Node temp = head;

        if(size <= 1){
            return deleteFirst();
        }

        for(int i = 0; i < size - 2; i++){
            temp = temp.next;
            val = temp.value;
        }

        tail = temp;
        tail.next = null;

        return val;
    }

    public int delete(int index){
        if(index == 1){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
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

    public Node get(int index){
        Node node = head;
        for(int i = 0; i< index; i++){
            node = node.next;
        }
        return node;
    }

    public void displayLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
