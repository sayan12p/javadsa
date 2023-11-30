package com.java.stack;

import java.util.Stack;

 class MyStack {
    int minEle;
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    MyStack() {
        //You can code here

    }

    int getMin() {
        //You can code here
        while(!stack.isEmpty()) {
            int currentelement=stack.pop();
            while (!temp.isEmpty() && temp.peek() > currentelement) {
                stack.push(temp.pop());
            }
            temp.push(currentelement);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        minEle=!stack.isEmpty()?stack.peek():0;
return minEle;
    }

    int pop() {
        //You can code here
        return stack.pop();

    }

    void push(int x) {
        //You can code here
        stack.push(x);

    }

}

public class GetMinimumElementFromStack {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(10);
        myStack.push(30);
        myStack.push(20);
        myStack.push(40);
        myStack.push(50); myStack.push(45);
        myStack.push(35);
        myStack.push(60);

        //System.out.println(myStack.pop());
        System.out.println(myStack.temp);
        System.out.println(myStack.stack);
        System.out.println(myStack.getMin());
    }
}

