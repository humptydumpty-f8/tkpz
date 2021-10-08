package kpi.apeps.lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Альтернативний спосіб зміни порядку сортування
 */
public class ex3_3 {
    public static void main(String[] args) {

        //Створюємо незмінний список
        List<String> num = List.of("3", "5", "2", "4", "1");
        ;

        //Створюємо змінний список з незмінного
        List<String> numbers = new ArrayList<>(100);
        numbers.addAll(num);

        //Виводимо вихідний список
        System.out.println("\tOriginal list:\n" + numbers);

        //Виконуємо сортування за зростанням і виводим список
        Collections.sort(numbers);
        //Змиінюємо порядок сортування на спадання і виводим список
        Collections.reverse(numbers);
        System.out.println("\tSorted decending:\n" + numbers);

    }
}