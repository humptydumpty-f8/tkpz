package kpi.apeps.lec6;

/**
 * Клас з вбудованим механізмом порівняння
 */
public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return surname.length()-o.surname.length();
    }
}
