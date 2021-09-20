package kpi.apeps.lec3;

/**
 * Приклади використання специфікаторів формату printf()
 */
public class ex2_2 {
    public static void main(String[] args) {

//        Приклад 1.
//        System.out.printf("%+010.5f", Math.PI);

//        Приклад 2.
//        int x =10;
//        System.out.printf("%d%n%o%n%x", x, x,x);

//
//        Приклад 3.
//        System.out.printf("%d%n%f%n%e", 25, 25.,2.5e3);

//        Приклад 4.
//        System.out.printf("%d\t%c%n", 169, 169);

//        Приклад 5.
//        System.out.printf("%cPupkin 2020", 169);

//        Приклад 6.
//        String format = "%c%S %d";
//        System.out.printf(format, 169,"Pupkin",2020);

//        Приклад 7.
        String text=String.format("%c%S %d",169,"Pupkin",2020);
        System.out.println(text);

    }
}
