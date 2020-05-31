package com.sdeo.unit3;

/**
 * @author Sumit Deo
 */
public class MethodReferenceEx1 {

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceEx1::printMessage); // equivalent to: () -> printMessage()
        thread.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
