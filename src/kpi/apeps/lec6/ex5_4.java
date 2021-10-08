package kpi.apeps.lec6;

import java.util.PriorityQueue;

/**
 * Черга з пріоритетами
 */
public class ex5_4 {
    public static void main(String[] args) {

        // Create a Priority Queue
        PriorityQueue<String> namePriorityQueue = new PriorityQueue <> ();

        // Add items to a Priority Queue
        namePriorityQueue.add ( "Lisa");
        namePriorityQueue.add ( "Robert");
        namePriorityQueue.add ( "John");
        namePriorityQueue.add ( "Chris");
        namePriorityQueue.add ( "Angelina");
        namePriorityQueue.add ( "Joe");

        // Remove items from the Priority Queue (in alphabetical order)
        while (! namePriorityQueue.isEmpty ()) {
            System.out.println (namePriorityQueue.remove ());
        }


    }
}