package com.sdeo.unit1;

import com.sdeo.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sumit Deo
 */
public class Unit1ExerciseSolutionJava7 {

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
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2: Create a method that prints all the elements
        System.out.println("\nPrinting elements...");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return true;
            }
        });

        //Step 3: Create a method that prints all the elements starting with "S"
        System.out.println("\nPrinting elements where firstName starts with 'S'...");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("S");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {

        for (Person person: people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    interface Condition {

        boolean test(Person person);
    }
}
