package kpi.apeps.lec5;

import java.io.IOException;

public class ex6_0 {

    static int choice = 1;
    static boolean doRun = true;

    public static void main(String[] args) {

        do {
            System.out.printf("\nEnter a simbol: ");
            try {
                choice = System.in.read();
            } catch (IOException e){
                e.printStackTrace();
            }
            if (choice == 10) doRun = false;
            System.out.printf("%c - %d", choice,choice);

        }while (doRun);
    }
}