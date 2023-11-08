package practices.practice8;

import java.util.Stack;

public class BracketValidator {


    public static void main(String[] args) {

        String input1 = "()[]{}";
        System.out.println(input1 + " is " + (isValid(input1) ? "valid" : "invalid") + " brackets");

        String input2 = "([])}";
        System.out.println(input2 + " is " + (isValid(input2) ? "valid" : "invalid") + " brackets");

        String input3 = "{[]}";
        System.out.println(input3 + " is " + (isValid(input3) ? "valid" : "invalid") + " brackets");
    }





    public static boolean isValid(String input){

        Stack<Character>stack =new Stack<>();

        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);

            if(c=='('||c=='{'||c=='['){
                stack.push(c);

            }else if(c==')'||c=='}'||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((c==')'&&top!='(')||c=='}'&&top!='{'||c==']'&&top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
