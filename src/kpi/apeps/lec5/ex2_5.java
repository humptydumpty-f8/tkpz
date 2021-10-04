package kpi.apeps.lec5;
import java.util.Arrays;
import java.util.Collections;

/**
 * Зміна порядку сортування масвів
 */
public class ex2_5 {

    public static void main(String[] args) {


        Integer[] i_arr = {-1,2,-3};
        Double[] d_arr = {1.,-2.,3.};
        Character[] c_arr = {130,126,150};
        String[] str = {"st1","st2","st3"};

        System.out.println(
                "\t after sorting:" + "\n" +
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );

        Arrays.sort(i_arr, Collections.reverseOrder());
        Arrays.sort(d_arr,Collections.reverseOrder());
        Arrays.sort(c_arr,Collections.reverseOrder());
        Arrays.sort(str,Collections.reverseOrder());

        System.out.println(
                "\t after resorting:" + "\n" +
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );
    }
}
