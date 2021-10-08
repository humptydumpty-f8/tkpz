package kpi.apeps.lec6;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Стек на основі Deque
 */
public class ex5_2 {
    public static void main(String[] args) throws InterruptedException {

        int time = Integer.parseInt (args [0]);
        Deque<Integer> deque = new LinkedList<Integer>();

        for (int i = time; i>= 0; i--)
            deque.push(i);

        while (!deque.isEmpty ()) {
            System.out.println(deque.pop());
            Thread.sleep(1000);
        }

    }
}