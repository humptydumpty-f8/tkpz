package kpi.apeps.lec5;

import java.util.ArrayList;
import java.util.Iterator;

public class ex7_6 {

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>(6);
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");

        Iterator<String> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

