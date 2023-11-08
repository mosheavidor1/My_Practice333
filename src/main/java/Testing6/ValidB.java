package Testing6;


import java.util.Stack;





public class ValidB {


    public static void main(String[] args) {

        String valA = "{([])}";
        String valB = "{{)]){";
        String valC = "()";

        System.out.println(isValid(valA));
        System.out.println(isValid(valB));
        System.out.println(isValid(valC));


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

