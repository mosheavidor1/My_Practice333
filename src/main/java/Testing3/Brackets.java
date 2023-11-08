package Testing3;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {


        String val1 = "()";
        String val2 = "{[)";
        String val3 = "[()]";
        System.out.println(isValid(val1));
        System.out.println(isValid(val2));
        System.out.println(isValid(val3));
    }


    private static boolean isValid(String text) {

        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();

            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

