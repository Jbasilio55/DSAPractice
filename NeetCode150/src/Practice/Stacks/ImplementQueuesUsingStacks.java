package Practice.Stacks;

import java.util.Stack;

//232. Implement Queue using Stacks - Easy
public class ImplementQueuesUsingStacks {
    class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }

            stack2.push(x);

            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }

        public int pop() {
            return stack1.pop();
        }

        public int peek() {
            return stack1.peek();
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }
}
