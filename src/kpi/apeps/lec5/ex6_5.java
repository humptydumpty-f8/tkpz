package kpi.apeps.lec5;

import java.io.IOException;

public class ex6_5 {

    public static void main(String[] args) throws IOException {

        int i;
        do {
            System.out.println("\tMenu:\n" +
                    "1. Gommand#1\t" +
                    "2. Gommand#2\t" +
                    "3. Exit"
            );
            System.out.println("\nEnter number (1-3):");
            switch (i = System.in.read()){
                case '1':
                    System.out.println("Runing Gommand#1");
                    break;
                case '2':
                    System.out.println("Runing Gommand#2");
                    break;
                case '3':
                    System.out.println("Exit!!!");
                    break;
            }
        }while (i<'1' || i>'3');
    }
}