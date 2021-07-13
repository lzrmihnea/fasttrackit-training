package org.fasttrackit.course7.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {
        // Array
        String[] carsArray = new String[2];
        carsArray[0] = "new car";
        carsArray[1] = "another car";
        //carsArray[2] = "old car"; // ArrayIndexOutOfBoundsException thrown!


        // Array List
        //ArrayList<String> carsArrayList = new ArrayList<>();
        System.out.println("\n Array Lists");
        List<String> carsArrayList = new ArrayList<>();
        carsArrayList.add("Mihnea's Dacia Logan"); // write
        carsArrayList.add("Ramona's Audi");
        carsArrayList.add("Elon Musk's Tesla");

        System.out.println(carsArrayList.get(0)); // read
        carsArrayList.remove(0); // delete
        System.out.println(carsArrayList.get(0)); // read

        // Linked List
        System.out.println("\n Linked Lists");
        LinkedList<String> tractorLinkedList = new LinkedList<>();
        tractorLinkedList.add("John Deere");
        tractorLinkedList.add("Aro");
        System.out.println(tractorLinkedList);

        tractorLinkedList.addFirst("Lamborghini");
        System.out.println(tractorLinkedList);

        tractorLinkedList.addLast("Ford");
        System.out.println(tractorLinkedList);

        tractorLinkedList.addFirst("Aro");
        System.out.println(tractorLinkedList);

        /**
         * FIFO vs LIFO
         * FIFO (coada, queue): first-in, first-out
         * - example: store queues for paying
         *
         * LIFO (stiva, stack): last-in, first-out
         * - example: stack of objects, like the Tower of Hanoi
         */
    }
}
