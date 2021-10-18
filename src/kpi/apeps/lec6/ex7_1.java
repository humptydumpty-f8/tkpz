package kpi.apeps.lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Способи створення потоків даних
 */
public class ex7_1 {
    public static void main(String[] args) {

        //1. Використання метода stream() колекції
        System.out.println("1. Method stream():");
        List<String> nameOfNumbers1 = new ArrayList<>(100);
        Collections.addAll(nameOfNumbers1, "one", "two", "three");
        nameOfNumbers1.stream()
                .forEach(s -> System.out.println(s));


        //2. Використання метода stream() Arrays
        System.out.println("2. Method Arrays.stream():");
        String[] nameOfNumbers = {"four", "five", "six"};
        Stream<String> nameOfNumbers2 = Arrays.stream(nameOfNumbers);
        nameOfNumbers2
                .forEach(s -> System.out.println(s));

        //3. Використання метода Stream.of
        System.out.println("3. Method Stream.of():");
        Stream<String> nameOfNumbers3 = Stream.of(nameOfNumbers);
        nameOfNumbers3
                .forEach(s -> System.out.println(s));
    }
}
