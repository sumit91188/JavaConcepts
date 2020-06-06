package com.sdeo.ex2;

/**
 * @author Sumit Deo
 */
public class Producer extends Thread{

    Message message;
    Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            message.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
