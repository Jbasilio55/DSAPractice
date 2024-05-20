package Practice.Stacks;

//682. Baseball Game

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] test1 = {"5", "2", "C", "D", "+"};
        String[] test2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        String[] test3 = {"1", "C"};

        System.out.println(calPoints(test1));
        System.out.println(calPoints(test2));
        System.out.println(calPoints(test3));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++)
            if(operations[i].equals("+")){
                int val2 = stack.pop();
                int val1 = stack.pop();
                int newVal = val1 + val2;
                stack.push(val1);
                stack.push(val2);
                stack.push(newVal);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek() * 2);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        while(!stack.empty()){
            sum += stack.pop();
        }
        return sum;
    }
}
