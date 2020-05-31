package com.sdeo.unit2;

import com.sdeo.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Sumit Deo
 */
public class Unit1ExerciseSolutionJava8 {

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

        //Step 1: Sort the list by lastName
        System.out.println("Sorting elements...");
        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

        //Step 2: Create a method that prints all the elements
        System.out.println("\nPrinting elements...");
        performConditionally(people,
                person -> true,
                person -> System.out.println(person.getLastName()));

        //Step 3: Create a method that prints all the elements starting with "S"
        System.out.println("\nPrinting elements where firstName starts with 'S'...");
        performConditionally(people,
                person -> person.getFirstName().startsWith("S"),
                person -> System.out.println(person.getFirstName()));
    }

    private static void performConditionally(List<Person> people,
                                             Predicate<Person> predicate,
                                             Consumer<Person> consumer) {

        for (Person person: people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
