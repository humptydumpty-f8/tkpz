package kpi.apeps.lec3;

import java.util.concurrent.TimeUnit;

/**
 * Приклад використання \b
 */
public class ex1_5 {
    public static void main(String[] args) throws InterruptedException {

        System.out.print("2 + 2 = 5");
        TimeUnit.SECONDS.sleep(3);//Затримка 3 сек
        System.out.print("\b");
        TimeUnit.SECONDS.sleep(3);//Затримка 3 сек*
        System.out.print("4");
    }
}
