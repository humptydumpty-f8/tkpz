package kpi.apeps.lec5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Сортування масивів
 */
public class ex2_4 {

    public static void main(String[] args) {

        int[] i_arr = {-1,2,-3};
        double[] d_arr = {1,-2,3};
        char[] c_arr = {130,126,150};
        boolean[] bul_arr = {false,true,false};
        String[] str = {"st1","st2","st3"};

        System.out.println(
                "\t before sorting:" + "\n" +
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "boolean " + Arrays.toString(bul_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );

        Arrays.sort(i_arr);
        Arrays.sort(d_arr);
        Arrays.sort(c_arr);
//        Arrays.sort(bul_arr);
        Arrays.sort(str);

        System.out.println(
                "\t after sorting:" + "\n" +
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "boolean " + Arrays.toString(bul_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );
    }
}
