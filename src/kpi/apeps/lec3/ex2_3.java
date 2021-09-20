package kpi.apeps.lec3;

/**
 * Приклад форматованого виведення таблиці
 */
public class ex2_3 {
    public static void main(String[] args) {

        String format = "%3d %-20S %6.2f %n";

        System.out.printf("%3s %-20S %-10s %n", "#","Student","Height (v)");
        System.out.printf("%3s %-20S %-10s %n", "---","--------------------","------");
        System.out.printf(format, 1,"Pupkin",200.267);
        System.out.printf(format, 2,"bender",183.7);
        System.out.printf(format, 3,"Gritzatzueva",165.);


    }
}
