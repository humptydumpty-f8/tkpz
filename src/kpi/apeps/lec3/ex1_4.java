package kpi.apeps.lec3;

import java.util.concurrent.TimeUnit;

/**
 * Приклад використання \r для створення анімаційного ефекту
 */
public class ex1_4 {

    public static void main(String[] args) throws InterruptedException {
        // 10 циклів анімації
        for (int i=0;i<10;i++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
            System.out.print('\r');
            System.out.print("..");
            TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
            System.out.print('\r');
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
            System.out.print('\r');
        }
    }
}
