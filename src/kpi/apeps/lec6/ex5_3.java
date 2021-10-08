package kpi.apeps.lec6;

import java.util.*;

/**
 * Стек із застосуванням ArrayDeque
 */
public class ex5_3 {
    public static void main(String[] args) {

        //Створюємо стек
        Deque<Person> persons = new ArrayDeque<>(5) {
        };

        //Заповнюємо його
        persons.push(new Person("Дмитро","Гулак-Травін"));
        persons.push(new Person("Артем","Гулак"));
        persons.push(new Person("Галина","Рудь"));
        persons.push(new Person("Павло","Дудар"));
        persons.push(new Person("Артем","Семиніжка"));

        //Вилучаємо зі стеку
        for (Person p:persons
             ) {
            System.out.println(persons.pop());
        }

    }
}