package kpi.apeps.lec4;

/**
 * Способи створення обєктів класу String
 */
public class ex5_1 {
    public static void main(String[] args) {

        String str1 = new String("Строка ");
        String str2 = "Эта строка создана при помощи литерала.";
        String str3 = "\u039A\u0399\u03a4";//ΚΙΤ
        String str4 = "\061\062\063";//123
        char[] chars = {'c', 'a', 't'};
        String str = new String(chars);

        System.out.println("Конструктор: " + str1);
        System.out.println("Літерал: " + str2);
        System.out.println("Юнікод: " + str3);
        System.out.println("8-ий код: " + str4);
        System.out.println("Масив: " + str);
    }
}
