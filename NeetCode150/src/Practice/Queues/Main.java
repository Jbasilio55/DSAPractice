package Practice.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        //***************************************************************
        // Queue =  FIFO data structure. First-In First-Out (ex. Line of people)
        //          A Collection designed for holding elements prior to processing
        //          Linear data structure

        //          add    = enqueue, offer()
        //          remove = dequeue, poll()
        //***************************************************************

        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.offer("Adam");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Adam"));

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-First search

        CustomQueue queue1 = new CustomQueue(5);
        queue1.insert(3);
        queue1.insert(6);
        queue1.insert(5);
        queue1.insert(19);
        queue1.insert(1);

        queue1.display();

        System.out.println(queue1.remove());
        queue1.display();

        CircularQueue queue2 = new CircularQueue(5);
        queue2.insert(20);
        queue2.insert(6);
        queue2.insert(5);
        queue2.insert(19);
        queue2.insert(1);

        queue2.display();

//        System.out.println(queue2.remove());
//        queue2.display();
    }
}
