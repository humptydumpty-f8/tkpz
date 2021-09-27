package kpi.apeps.lec4;

/**
 * Літеральні форми символів
 */
public class ex1_6 {
    public static void main(String[] args) {

        char ch;
    //Символьна форма
        ch = 'f';
        System.out.println("\'f\' = " + ch);// символ 'f'
    //10-ковий код
        ch = 102;
        System.out.println("102 = " + ch);// символ 'f'
    //8-ковий код
        ch = '\146';
        System.out.println("\\146 = " + ch);// символ 'f'
    //16-ковий код
        ch = '\u0066';
        System.out.println("\\u0066 = " + ch);// символ 'f'

    }
}
