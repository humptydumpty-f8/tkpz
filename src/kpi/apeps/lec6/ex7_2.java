package kpi.apeps.lec6;

import java.util.*;
import java.util.stream.Stream;

/**
 * Перебір, фільтрація і відображення
 */
public class ex7_2 {
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
                .filter(s -> s.getName().equals("Артем"))//Фільтрація
                .map(s->s.getSurname())//Відображення
                .forEach(s-> System.out.println(s.toUpperCase(Locale.ROOT)));//Перебір

    }
}
