package com.java.stack;

public class ImplementationOfStackUsingArrays {

    int size;
    int[] a;
    int top;

    public ImplementationOfStackUsingArrays(int size) {
        this.size = size;
        a=new int[size];
        this.top=-1;
    }
    boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
    boolean isfull(){
        if(top==size-1) return true;
        return false;
    }
    boolean push(int data){
        if(isfull()){
            System.out.println("stack overflow");
            return false;
        }else{
            top++;
            a[top]=data;
            return true;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }else{
            int temp=a[top];
            top--;
            return temp;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }else{
            int temp=a[top];
            return temp;
        }
    }
    void printstack(){
        for(int i=0;i<=top;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ImplementationOfStackUsingArrays a=new ImplementationOfStackUsingArrays(4);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.printstack();
        a.push(5);
        a.printstack();
        a.pop();
        a.pop();
        a.printstack();
    }
}
