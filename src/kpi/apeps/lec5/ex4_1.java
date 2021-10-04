package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Обхід масиву цілих чисел за допомогою foreach
 */

public class ex4_1 {

    public static void main(String[] args) {

        int[] i_arr = {1, 2, 3, 4, 5};
        System.out.print("[");
        for (int i : i_arr) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }
}
