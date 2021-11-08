package kpi.apeps.lec9;

/**
 * Перевизначення методів класу Object
 */
public class ex6_1 {
    public static void main(String[] args) {

        class Person {
            private String name;

            public Person(String name) {
                this.name = name;
            }

            public Person() {
                super();
            }

            @Override
            public String toString() {
                return "Person " + name;
            }

            @Override
            public int hashCode() {
                return this.name.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (!(obj instanceof Person)) return false;
                Person p = (Person)obj;
                return this.name.equals(p.name);
            }
        }

        Person person1 = new Person("Pupkin");
        Person person2 = new Person("Pupkin");

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person2.equals(person1));
    }
}
