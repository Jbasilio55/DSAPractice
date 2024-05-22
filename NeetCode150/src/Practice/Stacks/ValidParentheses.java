package Practice.Stacks;
// 20. Valid Parentheses | Easy
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";

        System.out.println(isValid(test1));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
    }

    public static boolean isValid(String s) {
        // Create an empty stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        // Loop through every character in the string
        for(char c : s.toCharArray()){
            // If the character is an opening bracket, push it onto the stack
            if(c == '(' || c == '{' || c =='['){
                stack.push(c);
            }else{
                // If the character is a closing bracket
                // If the stack is empty, there is no matching opening bracket, so return false
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                // Otherwise, get the top of the stack and check if it's the matching opening bracket
                if(c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '['){
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                }else{
                    // Otherwise, the brackets don't match, so return false
                    return false;
                }
            }
        }
        // If the stack is empty, all opening brackets have been closed, so return true
        // Otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
}
