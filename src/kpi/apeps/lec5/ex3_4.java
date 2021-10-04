package kpi.apeps.lec5;

/**
 * Перебір елементів в 3-вимірному масиві
 */

public class ex3_4 {

    public static void main(String[] args) {

        int[][][]nums = new int[][][]{
                {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8}},
                {
                    {10, 12, 13, 15},
                    {11, 20, 30, 50}}};

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k <nums[i][j].length ; k++) {
                    System.out.println(nums[i][j][k]);
                }
            }
        }
    }
}
