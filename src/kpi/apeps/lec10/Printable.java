package kpi.apeps.lec10;

import java.util.Date;

/**
 * Оголошення інтерфейсу
 */
public interface Printable{
    void print();//Метод інтерфейсу (без реалізації)
    default void preview(){System.out.println("Preview available");}//Метод за замовчуванням
    static Date printDate(){return new Date();//Статичний метод
    }
}
