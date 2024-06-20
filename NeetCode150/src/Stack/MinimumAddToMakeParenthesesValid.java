package Stack;
//921. Minimum Add to Make Parentheses Valid - Medium
import java.util.Stack;

/**
 * @author Jorge Basilio
 */

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
        }
        return stack.size();
    }

    public int minAddToMakeValid2(String s) {
        Stack<Character> stack =new Stack<>();

        int count=0;

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')') {
                if(stack.isEmpty()){
                    count++;
                } else{
                    stack.pop();
                }
            }
        }
        return stack.size() + count;
    }
}
