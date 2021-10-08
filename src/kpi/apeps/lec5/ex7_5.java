package kpi.apeps.lec5;

import java.util.ArrayList;

public class ex7_5 {

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>(6);
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");

        for (String elem:numbers ) {
            System.out.println(elem);
        }
    }
}

