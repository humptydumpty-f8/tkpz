package kpi.apeps.lec6;

import java.util.ArrayList;
import java.util.List;

/**
 * Сортування в потоці з використанням компаратора
 */
public class ex7_4 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(5);

        //Заповнюємо його
        persons.add(new Person("Дмитро", "Гулак-Травін"));
        persons.add(new Person("Артем", "Гулак"));
        persons.add(new Person("Галина", "Рудь"));
        persons.add(new Person("Павло", "Дудар"));
        persons.add(new Person("Артем", "Семиніжка"));

        persons.stream()
                .sorted(new PersonSurnameComparator())// Сортування  з використанням компаратора
                .forEach(s-> System.out.println(s));//Перебір
    }
}
