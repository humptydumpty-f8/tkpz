package kpi.apeps.lec6;

import java.util.ArrayList;
import java.util.List;

/**
 * Сортування в потоці у спосіб що передбачений в класі
 */
public class ex7_3 {
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
                .sorted()// Сортування у спосіб що передбачений в класі
                .forEach(s-> System.out.println(s));//Перебір
    }
}
