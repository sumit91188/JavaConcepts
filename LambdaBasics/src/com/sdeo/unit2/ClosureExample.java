package com.sdeo.unit2;

/**
 * @author Sumit Deo
 */
public class ClosureExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        doProcess(10, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process process) {

        process.process(i);
    }
}

interface Process {

    void process(int i);
}