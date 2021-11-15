package kpi.apeps.lec10;

/**
 * Анонімний внутрішній клас як реалізація інтерфейсу
 */

//Зовнішній клас
class Student_new_1 {
    String fullName;
    String group;

    public Student_new_1(String fullName, String group) {
        this.fullName = fullName;
        this.group = group;
    }

    void showInfo() {

        //Анонімний внутрішній клас з реалізацією інтерфейсу
        var recordBook = new Printable() {
            @Override
            public void print() {
                System.out.printf("%s \t %s \t %d",
                        fullName, group, 44444444);
            }
        };

    }
}

public class ex6_1 {
    public static void main(String[] args) {

        Student_new_1 student = new Student_new_1("Zupkin", "TB-01");
        student.showInfo();
    }
}
