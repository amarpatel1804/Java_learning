import java.util.Stack;

public class validParanthesis {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false; // Invalid character or mismatched parentheses
                }
            }

            return stack.isEmpty(); // All parentheses should be matched and removed
        }

        public static void main(String[] args) {
            String test1 = "()"; // Valid parentheses
            String test2 = "()[]{}"; // Valid parentheses
            String test3 = "(]"; // Invalid parentheses
            String test4 = "([)]"; // Invalid parentheses

            System.out.println(isValid(test1)); // true
            System.out.println(isValid(test2)); // true
            System.out.println(isValid(test3)); // false
            System.out.println(isValid(test4)); // false
        }
    }


