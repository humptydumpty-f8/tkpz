package kpi.apeps.lec5;

import java.util.Random;

/*Генератор случайных чисел*/
public class ex5_2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int i=0;
        for (;; i = rnd.nextInt(10)) System.out.print(i + " ");
    }
}