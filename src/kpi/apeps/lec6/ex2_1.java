package kpi.apeps.lec6;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Типові методи інтерфейсу Collection на прикладі списку Vector
 */
public class ex2_1 {
    public static void main(String[] args) {

        //Створюємо пусту колекцію
        List<Integer> numbers = new Vector<Integer>(5);

        //Додаємо в колекцію три елементи
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);

        //Якщо колекція не пуста, виводимо її розмір
        if (!numbers.isEmpty()) System.out.printf("Size: %d%n", numbers.size());

        //Відображаєм колекцію
        System.out.println("Collections:\n" + numbers);

        //Перевіряємо наявність елементів
        System.out.printf("Contain 0: %b%n", numbers.contains(0));
        System.out.printf("Contain 2: %b%n", numbers.contains(2));

        //Видаляємо елемент по індексу
        numbers.remove(0);
        System.out.printf("Contain -1: %b%n", numbers.contains(-1));

        //Перетворюємо колекцію на масив і виводимо його
        System.out.println(Arrays.toString(numbers.toArray()));

        //todo: Replace the legacy class Vector with a modern class ArrayList
    }
}
