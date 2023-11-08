package prcatice7;

import java.util.*;




public class ValidBrackets {

    public static void main(String[] args) {

String a= "{()}";
String b="[]";
String c ="()";

if(getValid(b)){
    System.out.println("valid");

}else {

    System.out.println("not valid");
}
    }



    private static boolean getValid(String text) {
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