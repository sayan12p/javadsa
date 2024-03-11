package com.java.multithreading;



public class Threadtest {

    public static void main(String[] args) {
        MathService mathService = new MathService();

        Thread threadOne = new Thread(new CallMathService(mathService,new int[]{10,11,12}));
        Thread threadTwo = new Thread(new CallMathService(mathService,new int[]{20,21,22}));
        threadOne.start();
        threadTwo.start();
    }
}
class CallMathService implements Runnable{

    MathService m;
    int[] numbers;
    public CallMathService(MathService m,int[] numbers) {
        this.m = m;
        this.numbers=numbers;
    }

    @Override
    public void run() {
    m.getSumOfArray(numbers);
    }
}
class MathService {


    synchronized void getSumOfArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            System.out.println(Thread.currentThread()
                    .getName()
                    + " adds "
                    + sum + " to "
                    + number + " to get -> "
                    + (sum += number));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}