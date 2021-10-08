package kpi.apeps.lec5;

import java.util.Random;

/*Вывод последовательных чисел*/
public class ex5_4 {

    final static int MIN_BOUND = 0;
    final static int MAX_BOUND = 10;

    public static void main(String[] args) {

        for (
                int k = MIN_BOUND;
                ++k < MAX_BOUND;)
            System.out.print(k + " ");
    }
}