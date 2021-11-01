package kpi.apeps.lec7;

/**
 * Два класи в одному файлі
 * Як public можна позначити тільки клас з іменем файла
 */
 class MyClass {
    // Поле
    String name = "Example";

    // Конструктор1
    public MyClass(String name) {
        this.name = name;
    }

    // Конструктор2
    public MyClass() {
        this("Example");// Виклик іншого конструктора
//        this.name = "Example";
    }
    // Метод
    public String getName() {
        return name;
    }

    protected void finalize () {
        System.out.println("MyClass was finalized!!!");
    }
}


public class ex1_1 {

    public static void main(String[] args) {

        var my = new MyClass();
        var my1 = new MyClass("Example #2");

        System.out.println(my.getName());
        System.out.println(my1.getName());

    }
}
