package com.sdeo.ex1;

/**
 * @author Sumit Deo
 */
public class ExImplementRunnable {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(10);
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    static class MyThread implements Runnable {

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}
