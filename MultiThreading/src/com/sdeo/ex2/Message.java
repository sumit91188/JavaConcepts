package com.sdeo.ex2;

/**
 * @author Sumit Deo
 */
public class Message {

    boolean flag = true;
    int count = 0;

    public synchronized void produce() throws InterruptedException {

        while (true) {
            if (flag) {
                count+=1;
                System.out.println("Produced item: " + count);
                flag = false;
                notify();
                wait();
            }
            else {
                wait();
            }
        }
    }

    public synchronized void consume() throws InterruptedException {

        while (true) {
            if (flag) {
                wait();
            }
            else {
                System.out.println("Consumed item: " + count);
                flag = true;
                notify();
                wait();
            }
        }
    }
}
