package kpi.apeps.lec3;

import java.util.concurrent.TimeUnit;

/**
 * Приклад використання \r
 */
public class ex1_3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.print("Чорне");
        TimeUnit.SECONDS.sleep(3);//Затримка 3 сек
        System.out.print('\r');
        System.out.print("Біле");
    }
}
