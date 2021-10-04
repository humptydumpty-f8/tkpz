package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Перебір елементів 2-вимірного масиву цілих чисел за допомогою foreach
 */

public class ex4_4 {

    public static void main(String[] args) {

        int[][] i_arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}};

        for (int[] i : i_arr) {
            for (int j:i) {
                System.out.println(j);
            }
        }
//        todo: Loop over elements in a 3D array with foreach
    }
}
