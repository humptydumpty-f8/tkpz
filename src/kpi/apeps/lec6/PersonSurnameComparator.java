package kpi.apeps.lec6;

import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}
