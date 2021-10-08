package kpi.apeps.lec6;

import java.util.*;

/**
 * Упорядкування в множинах
 */
public class ex4_1 {
    public static void main(String[] args) {

        //Створюємо незмінну множину
        Set<Person> persons = Set.of(
                new Person("Дмитро","Гулак-Травін"),
                new Person("Артем","Гулак"),
                new Person("Галина","Рудь"),
                new Person("Павло","Дудар"),
                new Person("Артем","Семиніжка")
                );

        //Створюємо змінні множини різних видів
        Set<Person> numbersHashSet = new HashSet<>(100);
        numbersHashSet.addAll(persons);

         Set<Person> numbersLinkedHashSet = new LinkedHashSet<>(100);
        numbersLinkedHashSet.addAll(persons);

         Set<Person> numbersTreeSet = new TreeSet<>();
        numbersTreeSet.addAll(persons);

        Set<Person> numbersTreeSetComparator = new TreeSet<>(new PersonSurnameComparator());
        numbersTreeSetComparator.addAll(persons);

        //Виводимо множини
        System.out.println("HashSet:\n");
        for (Person p:numbersHashSet
             ) {
            System.out.println(p.toString());
        }

        System.out.println();

        System.out.println("LinkedHashSet:\n");
        for (Person p:numbersLinkedHashSet
             ) {
            System.out.println(p.toString());
        }

        System.out.println();

        System.out.println("TreeSet:\n");
        for (Person p:numbersTreeSet
             ) {
            System.out.println(p.toString());
        }
        System.out.println();

        System.out.println("TreeSet+Comparator:\n");
        for (Person p:numbersTreeSetComparator
             ) {
            System.out.println(p.toString());
        }
        System.out.println();

    }
}