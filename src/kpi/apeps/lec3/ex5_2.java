package kpi.apeps.lec3;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * "Сканування" текстового рядка
 */
public class ex5_2 {
    public static void main(String[] args) {
        String contents ="Hello World!" +
                "Hello World!\n" +
                "Welcome to Java!";

        System.out.println(contents);
        System.out.println();
        Scanner scanner = new Scanner(contents);
        do {
            System.out.println(scanner.next());
        }while (scanner.hasNext());
    }
}
