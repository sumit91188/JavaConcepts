package com.sdeo.unit2;

import java.util.function.BiConsumer;

/**
 * @author Sumit Deo
 */
public class ExceptionHandlingEx {

    public static void main(String[] args) {

        int[] ints = {10,20,30,40,50};
        int key = 0;

        process(ints, key, wrapper((i, k) -> System.out.println(i / k)));
    }

    private static void process(int[] ints, int key, BiConsumer<Integer, Integer> consumer) {

        for (int i: ints) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer) {

        return (i, k) -> {
            try {
                consumer.accept(i, k);
            }
            catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException.getMessage());
            }
        };
    }
}
