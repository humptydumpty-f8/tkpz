package kpi.apeps.lec8;

import kpi.apeps.lec7.Student;// Повне імя класу, що імпортується

/**
 * Імпорт класу з іншого пакету
 */
public class ex1_2 {
    public static void main(String[] args) {
        //Використання імпортованого класу
        var student = new Student("Pupkin");
        student.getInfo();
    }
}
