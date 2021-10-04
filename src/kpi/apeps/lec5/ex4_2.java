package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * for дозволяє змінювати елементи масиву в циклі, на відміну від foreach
 */

public class ex4_2 {

    public static void main(String[] args) {

        int[] i_arr = {1, 2, 3, 4, 5};

        System.out.println("foreach:");
        System.out.print("[");
        for (int i : i_arr) {
            i*=2;
            System.out.print(i + " ");
        }
        System.out.print("]\n");
        System.out.print(Arrays.toString(i_arr));

        System.out.println("\nfor:");
        System.out.print("[");
        for (int i = 0; i <i_arr.length ; i++) {
            i_arr[i]*=2;
            System.out.print(i_arr[i] + " ");
        }
        System.out.print("]\n");
        System.out.println(Arrays.toString(i_arr));
    }
}
