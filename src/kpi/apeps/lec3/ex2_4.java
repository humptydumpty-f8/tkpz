package kpi.apeps.lec3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Застосунок "Цифровий годинник"
 * Використовується застарілий специфікатор %tT
 */
public class ex2_4 {
    public static void main(String[] args) throws InterruptedException {

        // 10 циклів анімації
        for (int i=0;i++<10;) {
            System.out.printf("%tT", new Date() );
            TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
            System.out.print("\r");
        }

    }
}
