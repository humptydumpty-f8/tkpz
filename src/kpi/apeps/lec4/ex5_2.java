package kpi.apeps.lec4;

import java.util.Arrays;

/**
 * Основні методи класу String
 */
public class ex5_2 {
    public static void main(String[] args) {

        String str1 = new String("Строка 1 ");
        String str2 = "Строка 2 ";

        System.out.println(str1.concat(str2));
        System.out.println(str2. length());//9
        System.out.println(str1.charAt(1));//т
        System.out.println(str1.substring(7,9));//1
        System.out.println(Arrays.toString(str2.split(" ")));
        System.out.println (str1.contains("1"));//true
        System.out.println(str2.indexOf('к'));//4

    }
}
