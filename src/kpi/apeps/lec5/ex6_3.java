package kpi.apeps.lec5;

import java.util.Arrays;

public class ex6_3 {

    static int[] array = {1,2,3,4,5};

    public static void main(String[] args) {
        int temp;
        int i = -1, j = array.length;
        while (i++<j--){
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}