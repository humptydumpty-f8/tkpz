package kpi.apeps.lec5;

import java.io.IOException;
import java.util.Scanner;

public class ex6_1 {

    static int choice = 1;
    static boolean doRun = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.printf("\nEnter a simbol: ");
            String code = scanner.next();
            if (code.matches("\\w{1}"))
                System.out.printf("%s\t%d",code,(int)code.charAt(0));
            if (code.equals("=")) doRun = false;
        }while (doRun);
    }
}