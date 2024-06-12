package Practice.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deck {
    public static void main(String[] args){
        // Deque is a Double ended queue

        // The Deque is related to the double-ended queue that supports the addition or
        // removal of elements from either end of the data structure

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}
