package kpi.apeps.lec3;

import java.io.Console;

/**
 * Обробка параметрів командного рядка
 */
public class ex7_1 {
    public static void main(String[] args) {

        System.out.println("Parameters:");
        for (int i = 0; i < args.length ; i++) {
            System.out.printf("%d \t %s \n", i,args[i]);
        }

    }
}
