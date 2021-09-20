package kpi.apeps.lec3;

import java.io.IOException;

/**
 * Використання System.in.read() в циклі з обробкою IOException
 * Супроводжується артефактом Enter a symbol: Code: 10
 */

public class ex3_2 {
    public static void main(String[] args)  {

        boolean exit=true;
        int c=0;
        do {
            System.out.print("Enter a symbol: ");
            try {
                c=System.in.read();
            }
            catch (IOException e){
                System.err.println("Error:\n" + e);
            }
            System.out.println("Code: " + c);

//            exit=false;
        }while (exit);
    }
}
