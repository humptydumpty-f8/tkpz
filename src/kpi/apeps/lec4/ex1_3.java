package kpi.apeps.lec4;

/**
 * Цілочисельні операції з числами в різних представленнях
 */
public class ex1_3 {
    public static void main(String[] args) {

        int num111 = 0x6F; // 16-кова система, число 111
        int num8 = 010; // 8-кова система, число 8
        int num11 = 0b11; // 2-кова система, число 3
        int summa = num111 + num8 + num11;

        System.out.println("Неформатоване виведення");
        System.out.println("num111+num8+num11=" + (num111 + num8 + num11)); //122

        System.out.println("\nФорматоване виведення");
        System.out.printf("%h +%h +%h =%h%n",num111,num8,num11,num111 + num8 + num11);
        System.out.printf("%d +%d +%d =%d%n",num111,num8,num11,num111 + num8 + num11);
        System.out.printf("%h +%o +%b =%d",num111,num8,num11,summa);//%b - для boolean!
    }
}
