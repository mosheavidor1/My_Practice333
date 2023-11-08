package practices.practice8;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        MyStack myStack= new MyStack(5);


        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        Stack<Integer> s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(getStack(s));


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


        System.out.println(myStack.peek());





    }

public static Stack<Integer> getStack(Stack<Integer>stack) {





    for(int i:stack){


        break;
    }


return stack;
}
}