package kpi.apeps.lec4;

/**
 * При використанні суміщеного присвоювання (+ =, - =, * =, / =) можна обійтись без приведення
 */
public class ex4_1 {
    public static void main(String[] args) {

        byte b1 = 127, b2 = 80;
//        b1 = (b1 + b2); //Помилка компіляції!
        b1 += b2;
        System.out.println("b1=" + b1); //b1=-49
    }
}
