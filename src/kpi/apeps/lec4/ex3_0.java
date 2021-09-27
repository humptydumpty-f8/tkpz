package kpi.apeps.lec4;

/**
 * Неявне і явне приведення типів
 */
public class ex3_0 {
    public static void main(String[] args) {

        //Неявне приведення типів
        int numInt = 1111;
        double numDbl;
        numDbl = numInt;
        System.out.println("Double number:" + numDbl);

        //Явне приведення типів
        int numInteger;
        double numDouble = 2222.3333;
        numInteger = (int) numDouble;
        System.out.println("Integer number:" + numInteger);

        //Тип char - числовий
        char numChar = 'q';
        boolean numBoolean = true;
        System.out.println("Integer number:" + (int) numChar);
        System.out.println("Char:" + (char) numInt);
//        System.out.println("Integer number:" + (int)numBoolean);//Помилка компіляції!
//        System.out.println("Boolean number:" + (boolean)numChar);//Помилка компіляції!
    }
}
