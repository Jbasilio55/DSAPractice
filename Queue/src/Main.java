import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //A queue is a data structure with the "first in, first out” (FIFO) property.

        //It supports three operations:

        //Insert (or "Push"): Putting an item into the end of the queue.
        //Peek: Look at the first item of the queue.
        //Remove (or "Pop"): Remove the first item of the queue.

        //It is like a queue in real life: First come, first serve.

        //A deque is a double-ended queue. That means that inserting and removing items
        // from the queue can be done on both ends.

        //---------------Implementation--------------------
        //The implementation of a queue is similar to a stack: we use an array and two pointers,
        // one pointing at the start of the queue and the other pointing at the end of the queue.
        //
        //When inserting an item into the queue, we set the entry at the end pointer to the value and increase
        // the end pointer by one. When removing an item from the queue, we increase the start pointer by one.
        //
        //For a deque, we can use the same logic, but we allow the increment and decrement of both start and end pointers.

        //One of the current implementation flaws is that when one of the queue pointers reaches
        // the end of the array, it will cause an overflow. However, if some elements have been removed
        // from the other end, then when the queue overflows, there are still a lot of unused empty spaces,
        // which is not ideal.
        //
        //An improvement that can be done to this implementation is to make the array “loop." When a pointer
        // tries to move past the array, it loops around to the other end of the array instead. This is known as
        // a Circular Buffer.
        //
        //This works on both queues and deques.

        //Most modern programming languages offer a built-in deque data structure. They often use a dynamic array
        // as its underlying data structure (although they can also use a double-linked list, like Python's deque class).
        // You won't have to worry about deques overflowing because the resizing of the array is handled for you.

        Scanner scanner = new Scanner(System.in);
        int programLength = Integer.parseInt(scanner.nextLine());
        List<String> program = new ArrayList<>();
        for(int i = 0; i < programLength; i++){
            program.add(scanner.nextLine());
        }
        scanner.close();
        ArrayDeque<Integer> res = execute(program);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static ArrayDeque<Integer> execute(List<String> program) {
        // initialize a new Arraydeque representing a queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (String instruction : program) {
            if (instruction.equals("peek")) {
                if (queue.isEmpty()) {
                    // print warning message if queue is empty
                    System.out.println("Queue is empty!");
                } else {
                    // print out the first item in queue
                    System.out.println(queue.peek());
                }
            } else if (instruction.equals("pop")) {
                if (queue.isEmpty()) {
                    // print warning message if queue is empty
                    System.out.println("Queue is empty!");
                } else {
                    // pop the first item in queue
                    queue.poll();
                }
            } else {
                // get the data in the "push" instruction
                int data = Integer.parseInt(instruction.substring(5));
                // push data to the end of queue
                queue.add(data);
            }
        }
        return queue;
    }
}