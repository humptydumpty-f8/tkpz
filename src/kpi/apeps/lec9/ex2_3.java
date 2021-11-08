package kpi.apeps.lec9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Розширення та звуження типів при обробці колекцій
 */
public class ex2_3 {
    public static void main(String[] args) {

        //Батьківський клас
        class Parent{
            int num;

            Parent(int num) {
                this.num = num;
            }

            @Override
            public String toString() {
                return "Parent{" +
                        "num=" + num +
                        '}';
            }
        }

        //Клас-спадкоємець
        class Child extends Parent{
            String label;

            Child(int num, String label) {
                super(num);
                this.label = label;
            }

            @Override
            public String toString() {
                return "Child{" +
                        "num=" + num +
                        ", label='" + label + '\'' +
                        '}';
            }
        }

        //Створюємо колекцію
        ArrayList<Parent> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,
                new Parent(1),
                new Child(1,"a"),
                new Parent(2),
                new Child(2,"b"));

        //Розширюємо тип для обходу всієї колекції
        System.out.println("Вся колекція:");
        for (Parent elem: arrayList) {
            System.out.println(elem.toString());
        }
        //Звужуємо тип для виведення спадкоємців
        System.out.println("\nДочірні елементи:");
        for (Parent elem: arrayList) {
            if (elem instanceof Child)
            System.out.println(((Child)elem));
        }
    }
}
