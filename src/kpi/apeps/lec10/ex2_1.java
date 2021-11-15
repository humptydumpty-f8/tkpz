package kpi.apeps.lec10;

/**
 * Імплементація інтерфейсу
 */
public class ex2_1 {
    public static void main(String[] args) {

        //Клас, що імплементує інтерфейс
        class Person implements Printable{
            String name;
            String surName;

            //Визначення методу
            @Override
            public void print() {
                System.out.println("Person{" +
                        "name='" + name + '\'' +
                        ", surName='" + surName + '\'' +
                        '}');
            }
        }

        //Сценарій використання
        Person person = new Person();
        person.name ="Vasya";
        person.surName = "Pupkin";

        System.out.println(Printable.printDate());//Виклик статичного методу
        person.preview();//Виклик методу за замовчуванням
        person.print();//Виклик перевизначеного методу
    }
}
