package kpi.apeps.lec3;

import java.io.IOException;

/**
 * Використання System.in.read() без обробки IOException
 * Коректно обробляється тільки латиниця!
 */
public class ex3_1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a symbol:");
        int x = System.in.read();
        char c = (char) x;
        System.out.println("Код символа: " + c + " = " + x);
    }
}
