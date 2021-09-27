package kpi.apeps.lec4;

/**
 *Використання Integer.toBinaryString()
 */
public class ex2_4 {
    public static void main(String[] args) {

        int x=111, y=22;
        System.out.printf("Binary summa: %s + %s = %s",
                Integer.toBinaryString(x),//1010
                Integer.toBinaryString(y),//10100
                Integer.toBinaryString(x+y));//11110

    }
}
