package Practice.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Stack = LIFO data structure. Last-In First-Out
        //         Stores objects into a sort of "vertical tower"
        //         supports 5 methods (push, pop, peek, search, empty) - main operations (push, pop, peek)

        //         push() to add to top - O(1)
        //         pop() to remove from the top - O(1)
        //         peek() peek at the top - O(1)
        //         search() iterate through stack and find value stack.search(2) <-- find 2 - O(N)

        Stack<String> stack = new Stack<String>();
        // will return true because it's a new stack
        System.out.println(stack.empty());

        // add games to stack
        stack.push("Minecraft");
        stack.push("skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("Final Fantasy VII");

        //check if the stack is empty
        System.out.println(stack.empty());

        //print stack
        System.out.println(stack);

        //pop top game
        stack.pop();
        System.out.println(stack);

        //pop top game - will return the item
        String game = stack.pop();
        System.out.println(stack);
        System.out.println(game);

        //change name of game from stack and push back in stack
        game = "Spiderman";
        stack.push(game);
        System.out.println(stack);

        //peek top game without removing it
        System.out.println(stack.peek());

        //search stack for specific item - will return index from top
        System.out.println(stack.search("skyrim"));

        //beware you can run out of memory in heap if you add to many items to stack.

        //uses of stacks?
        //1. undo/redo features in text editors
        //2. moving back/forward through browser history
        //3. backtracking algorithms(maze, file directories)
        //4. calling functions (call stack)
    }
}
