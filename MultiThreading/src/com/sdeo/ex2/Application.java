package com.sdeo.ex2;

/**
 * @author Sumit Deo
 */
public class Application {

    public static void main(String[] args) {

        Message message = new Message();
        Producer producer = new Producer(message);
        Consumer consumer = new Consumer(message);

        producer.run();
        consumer.run();
    }
}
