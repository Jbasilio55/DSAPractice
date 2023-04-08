import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // A stack is a data structure with the "first in, last out” (FILO) property. That is, an item can be inserted
        // and removed from a stack, but an item can only be removed from the stack after all the items are added after
        // it is removed first.

        // It supports three operations:

        // Insert (or "Push"): Putting an item into the stack.
        // Peek: Look at the top item of the stack (the last inserted item that's not removed).
        // Remove (or "Pop"): Remove the top item of the stack.

        // Problem:

        // Given a mini program, consisting of a list of stack operations of push, pop, and peek, return the resulting stack
        // after the execution of the program. Print out the top item in the stack when you get a peek instruction.

        Scanner scanner = new Scanner(System.in);
        int programLength = Integer.parseInt(scanner.nextLine());
        List <String> program = new ArrayList<>();
        for(int i = 0; i < programLength; i++){
            program.add(scanner.nextLine());
        }
        scanner.close();
        List <Integer> res = execute(program);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static List<Integer> execute(List<String> program){
        // initialize the stack
        ArrayList<Integer> stack = new ArrayList<>();
        for(String instruction : program){
            if(instruction.equals("peek")){
                // print out the top item in stack
                System.out.println(stack.get(stack.size() - 1));
            } else if (instruction.equals("pop")) {
                //pop the top item in a stack
                stack.remove(stack.size() - 1);
            }else{
                //get the data in the "push" instruction
                int data = Integer.parseInt(instruction.substring(5));
                //push data to the top of the stack
                stack.add(data);
            }
        }
        return stack;
    }
}