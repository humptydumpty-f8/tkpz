package kpi.apeps.lec5;

import java.util.Random;

/*Генератор N случайных чисел*/
public class ex5_3 {

    final static int N = 100;
    final static int MAX_BOUND = 1000;

    public static void main(String[] args) {

        Random rnd = new Random();
        int i=0;
        for (
                int k = 0;
                k < N;
                k++,i = rnd.nextInt(MAX_BOUND)
                )
            System.out.print(i + " ");
    }
}