package Practice.Stacks;

import java.util.Stack;

//155. Min Stack - Medium
public class MinStack {

    public static void main(String[] args) {

    }

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty() || val < minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
