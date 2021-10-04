package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Відображення 2-вимірного масиву цілих чисел за допомогою foreach
 */

public class ex4_3 {

    public static void main(String[] args) {

        int[][] i_arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}};

        for (int[] i : i_arr) {
            System.out.println(Arrays.toString(i));
        }
//        todo: Display a 3D Array with foreach
    }
}
