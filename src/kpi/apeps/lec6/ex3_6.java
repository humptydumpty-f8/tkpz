package kpi.apeps.lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Сортування за механізмом, що визначений в класі
 */
public class ex3_6 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(5);

        //Заповнюємо його
        persons.add(new Person("Дмитро","Гулак-Травін"));
        persons.add(new Person("Артем","Гулак"));
        persons.add(new Person("Галина","Рудь"));
        persons.add(new Person("Павло","Дудар"));
        persons.add(new Person("Артем","Семиніжка"));

        //Сортуємо список за вбудованим в клас механізмом сортування
        Collections.sort(persons);

        //Виводимо відсортований список
        for (Person p:persons
             ) {
            System.out.println(p.toString());
        }

    }
}