package kpi.apeps.lec6;

import java.util.*;

/**
 * Створення і використання ітератора
 */
public class ex3_4 {
    public static void main(String[] args) {

        //Створюємо незмінний список (неіндексований)
        Set<Integer> num = Set.of(2, 5, 8, 1);

        //Створюємо змінний список з незмінного
        Set<Integer> numbers = new HashSet<>(100);
        numbers.addAll(num);

        //Створюємо ітератор
        Iterator iterator = numbers.iterator();

        System.out.println("Iterator:");
        //Перебераємо елементи колекції за допомогою ітератора
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Foreach:");
        //Перебераємо елементи колекції за допомогою циклу
        for (Integer i:numbers
             ) {
            System.out.print(i + " ");
        }
    }
}