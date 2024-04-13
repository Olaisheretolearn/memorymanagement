package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lists {
    public static void main(String[] args) {


        /*
        *
        * This file demonstrates why random access in LinkedList is expensive
        * because the get method in the LinkedList method , traverses one
        * by one to get to the
        * specified element
        *
        *
        *
        * Test size is 100,000,000 (million) elements
        * And we put random integers to make 100,
        *
        * The price you pay to be able to add elements at an any position
        *
        *
        * */


        // Generate a large list of integers
        int size = 10000000; // 1 million elements
        List<Integer> arrayList = generateArrayList(size);
        List<Integer> linkedList = generateLinkedList(size);

        // Access elements by index and measure time for ArrayList
        long startTimeArrayList = System.nanoTime();
        int elementArrayList = arrayList.get(size / 2); // Accessing element at the middle index
        long endTimeArrayList = System.nanoTime();
        long timeArrayList = endTimeArrayList - startTimeArrayList;

        // Access elements by index and measure time for LinkedList
        long startTimeLinkedList = System.nanoTime();
        int elementLinkedList = linkedList.get(size / 2); // Accessing element at the middle index
        long endTimeLinkedList = System.nanoTime();
        long timeLinkedList = endTimeLinkedList - startTimeLinkedList;

        // Output the results
        System.out.println("Time taken to access element by index in ArrayList: " + timeArrayList + " nanoseconds");
        System.out.println("Time taken to access element by index in LinkedList: " + timeLinkedList + " nanoseconds");
    }


    private static List<Integer> generateArrayList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }


    private static List<Integer> generateLinkedList(int size) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }
}

