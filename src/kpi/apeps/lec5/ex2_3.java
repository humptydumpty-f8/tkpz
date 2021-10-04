package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Заповнення масивів початковими значеннями
 */
public class ex2_3 {

    public static void main(String[] args) {


        int[] i_arr = {1,2,3};
        double[] d_arr = {1,2,3};
        char[] c_arr = {'1',126,'\u0077'};
        boolean[] bul_arr = {false,true,false};
        String[] str = {"1","2","3"};

        Arrays.fill(i_arr,1);
        Arrays.fill(d_arr,2);
        Arrays.fill(c_arr,'a');
        Arrays.fill(bul_arr,false);
        Arrays.fill(str,"null");

        System.out.println(
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "boolean " + Arrays.toString(bul_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );
    }
}
