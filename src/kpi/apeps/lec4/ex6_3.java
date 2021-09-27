package kpi.apeps.lec4;

import static kpi.apeps.lec4.Finder.isIn;

/**
 * Використання узагальненого метода класа Finder
 */
public class ex6_3 {
    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3};
        for (int i = 0; i < 5; i++) {
            if (isIn(i, intArr)) System.out.println(i + " in array");
            else System.out.println(i + " out array");
        }
        System.out.println();

        //todo: Try other E
    }
}
