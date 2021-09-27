package kpi.apeps.lec4;

/**
 * char -код символа
 */
public class ex1_7 {
    public static void main(String[] args) {

        char ch1 = 'f', ch2 = 102, ch3 = '\146', ch4 = '\u0066';

        System.out.println(ch1 + ch2 + ch3 + ch4);
        System.out.println((char) ch1 + (char) ch2 + (char) ch3 + (char) ch4);
        System.out.println('f' + 102 + '\146' + '\u0066');
        System.out.println("f" + 102 + "\146" + "\u0066");
    }
}
