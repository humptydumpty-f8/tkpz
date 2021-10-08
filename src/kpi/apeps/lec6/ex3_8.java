package kpi.apeps.lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Сортування за двома компараторами
 */
public class ex3_8 {
    public static void main(String[] args) {

        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonSurnameComparator());

        //Створюємо список
        List<Person> persons = new ArrayList<>();

        //Заповнюємо його
        persons.add(new Person("Дмитро","Гулак-Травін"));
        persons.add(new Person("Артем","Гулак"));
        persons.add(new Person("Галина","Рудь"));
        persons.add(new Person("Павло","Дудар"));
        persons.add(new Person("Артем","Семиніжка"));

        //Сортуємо список з використанням компаратора
        Collections.sort(persons,pcomp);

        //Виводимо відсортований список
        for (Person p:persons
             ) {
            System.out.println(p.toString());
        }

    }
}