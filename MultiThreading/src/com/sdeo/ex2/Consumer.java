package com.sdeo.ex2;

/**
 * @author Sumit Deo
 */
public class Consumer extends Thread{

    Message message;
    Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            message.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
