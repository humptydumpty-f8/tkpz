package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Бінарний пошук в масивах
 */
public class ex2_6 {

    public static void main(String[] args) {


        int[] i_arr = {-1,2,-3};
        double[] d_arr = {1,-2,3};
        char[] c_arr = {130,'a',150};
        String[] str = {"st1","st2","st3"};

        Arrays.sort(i_arr);
        Arrays.sort(d_arr);
        Arrays.sort(c_arr);
        Arrays.sort(str);

        System.out.println(
                "\t after sorting:" + "\n" +
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );


        System.out.println(
                "\t Binary search results:" + "\n" +
                "int " + Arrays.binarySearch(i_arr,-2) + "\n" +
                "double " + Arrays.binarySearch(d_arr, 10) + "\n" +
                "char " + Arrays.binarySearch(c_arr,'a') + "\n" +
                "String " + Arrays.binarySearch(str,"st2") + "\n" );
    }
}
