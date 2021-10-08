package kpi.apeps.lec6;

import java.util.*;

/**
 * Створення і використання ітератора
 */
public class ex3_5 {
    public static void main(String[] args) {

        //Створюємо незмінний список (індексований)
        List<Integer> num = List.of(2, 4, 3, 1);

        //Створюємо змінний список з незмінного
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(num);

        //Створюємо ітератор
        ListIterator listIterator = numbers.listIterator();

        System.out.println("ListIterator:");
        //Перебераємо елементи колекції за допомогою ітератора
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        listIterator.add(5);//Додаємо новий елемент в кінець списку
        listIterator.previous();//Повертаємось на попередню позицію
        listIterator.set(6);//Змінюємо значення
        listIterator.next();//Повертаємось на попередню позицію

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();


        System.out.println("Foreach:");
        //Перебераємо елементи колекції за допомогою циклу
        for (Integer i : numbers
        ) {
            System.out.print(i + " ");
        }
    }
}