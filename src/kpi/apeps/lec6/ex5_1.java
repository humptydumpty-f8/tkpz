package kpi.apeps.lec6;

import java.util.*;

/**
 * Таймер зворотнього відліку на основі Queue
 */
public class ex5_1 {
    public static void main(String[] args) throws InterruptedException {

        int time = Integer.parseInt (args [0]);
        Queue <Integer> queue = new LinkedList<Integer>();

        for (int i = time; i>= 0; i--)
            queue.add (i);

        while (!queue.isEmpty ()) {
            System.out.println(queue.poll());
            Thread.sleep(1000);
        }

    }
}