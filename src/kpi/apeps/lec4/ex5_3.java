package kpi.apeps.lec4;

import java.util.Arrays;

/**
 * Ідентичність двох рядків виявляє equals!
 */
public class ex5_3 {
    public static void main(String[] args) {

        String str1 = new String("Строка 1");
        String str2 = "Строка 1";

        if(str1==str2)System.out.println("True");
            else System.out.println("False");

        if(str1.equals(str2))System.out.println("True");
        else System.out.println("False");
    }
}
