package com.sdeo.unit3;

import com.sdeo.common.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sumit Deo
 */
public class StreamsExample1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sumit", "Deo", 32),
                new Person("Sneha", "Pimpley", 31),
                new Person("Apoorva", "Yeragi", 30),
                new Person("Sampada", "Aloni", 32),
                new Person("Ujjwal", "Garad", 30),
                new Person("Shruti", "Mandke", 28),
                new Person("Pratiksha", "Kulkarni", 30)
        );

        people.stream()
                .filter( person -> person.getFirstName().startsWith("S"))
                .forEach( p -> System.out.println(p.getFirstName()));

        long count = people.stream()
                .filter( person -> person.getFirstName().startsWith("S"))
                .count();

        System.out.println(count);

        people.parallelStream()
                .forEach(person -> System.out.println(person));
    }
}
