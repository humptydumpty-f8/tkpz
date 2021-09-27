package kpi.apeps.lec4;

/**
 * Використання цілочисельних типів
 */
public class ex1_1 {
    public static void main(String[] args) {

        //Автоматичне перетворення в цілочисельні типи
        byte b = 116;
        short s = 1123;
        int i = 64536;

        /*long l = 2147483648; // Помилка компіляції*/

        // Перетворення з використанням суфікса l (або L) в тип long
        long l = 2147483648l;

        System.out.println("Цілочисельні літерали:");
        System.out.printf("b=%d\n" +
                "s=%d\n" +
                "i=%d\n" +
                "l=%d",b,s,i,l);

    }
}
