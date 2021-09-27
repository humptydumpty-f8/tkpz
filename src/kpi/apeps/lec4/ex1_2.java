package kpi.apeps.lec4;

/**
 * Перетворення цілочисельних типах у виразах, "циклічність" int та long
 */
public class ex1_2 {
    public static void main(String[] args) {

        byte b1 = 1, b2=2;
//        byte b = b1+b2;//Помилка компіляції!
        byte b = (byte)(b1+b2);

        short s1 = 3, s2=4;
//        short s = s1+s2;//Помилка компіляції!
        short s=(short)(s1+s2);

        int i1=5,i2=2147483647;
        int i= i1+i2;//-2147483644

        long l1 = 2,l2= 2147483648L;
        long l=l1+l2;//2147483650

        System.out.println("Результати обчислень:");
        System.out.printf("b=%d\n" +
                "s=%d\n" +
                "i=%d\n" +
                "l=%d",b,s,i,l);
    }
}
