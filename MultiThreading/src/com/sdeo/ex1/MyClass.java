package com.sdeo.ex1;

/**
 * @author Sumit Deo
 */
public class MyClass {

    synchronized void myMethod() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    void myMethod1() {

        System.out.println("Before Sync + " + Thread.currentThread().getName());
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
