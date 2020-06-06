package com.sdeo.ex1;

/**
 * @author Sumit Deo
 */
public class ExExtendsThread {

    public static void main(String[] args) throws InterruptedException {

        MyClass myClass = new MyClass();
        MyThread myThread = new MyThread(myClass);
        MyThread myThread1 = new MyThread(myClass);
        myThread.start();
        myThread1.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("Running Main-thread " + i);
        }
    }

    static class MyThread extends Thread {

        MyClass myClass;

        MyThread(MyClass myClass) {
            this.myClass = myClass;
        }

        @Override
        public void run() {

            myClass.myMethod1();
        }
    }
}
