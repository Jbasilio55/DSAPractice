package Practice.LinkedList;

//707 Design Linked List

public class SinglyLinkedList {
    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        Node curr = this.head.next;
        int i = 0;

        while(curr != null){
            if(i == index){
                return curr.data;
            }
            i++;
            curr = curr.next;
        }
        return -1; //index out of bounds
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head.next;
        this.head.next = newNode;
        if(newNode.next == null){
            //If List was empty before inserting
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new Node(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        Node curr = this.head;

        while(i < index && curr != null){
            i++;
            curr = curr.next;
        }

        if(curr != null){
            curr.next = curr.next.next;
        }
        return true;
    }

//    public ArrayList<Integer> getValues() {
//
//    }

}

