package kpi.apeps.lec5;

/**
 * Перебір елементів в 2-мірному масиві
 */

public class ex3_3 {

    public static void main(String[] args) {


        int[][] nums = {
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
