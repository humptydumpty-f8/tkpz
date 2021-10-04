package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Створення і вивидення "зубчастого" масива на прикладі "трикутної" матриці
 */

public class ex3_2 {

    public static void main(String[] args) {


        int[][] nums = new int[5][];//Створюємо контейнер контейнерів
        //Заповнюєм контейнер іншими контейнерами
        nums[0] = new int[]{1, 1, 1, 1, 1};
        nums[1] = new int[]{1, 1, 1, 1};
        nums[2] = new int[]{1, 1, 1};
        nums[3] = new int[]{1, 1};
        nums[4] = new int[]{1};


        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
