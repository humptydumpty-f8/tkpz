package kpi.apeps.lec3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Обробка натиснення клавіш
 */

public class ex4_2 {
    public static void main(String[] args)  {
        boolean exit=true;
        String code="";
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a symbol: \n");
            code = in.next();
            System.out.printf("Code of %s is %d \n",code.charAt(0),Integer.valueOf(code.charAt(0)));
//            exit=false;
        }while (exit);
    }
}
