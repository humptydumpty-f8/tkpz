package kpi.apeps.lec3;

import java.util.concurrent.TimeUnit;

/**
 * Приклад використання \b та \r для створення анімаційного ефекту
 */
public class ex1_6 {
    public static void main(String[] args) throws InterruptedException {

        // 10 циклів анімації
        for (int i=0;i++<10;) {
            System.out.print("ANIME!");
            for (int j = 0; j < 7; j++) {
                TimeUnit.MILLISECONDS.sleep(100);//Затримка 100 мсек
                System.out.print("\b");
            }
        }
    }
}
