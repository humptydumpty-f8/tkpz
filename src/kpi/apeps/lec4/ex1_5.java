package kpi.apeps.lec4;

/**
 * Присвоєння змінній типу float
 */
public class ex1_5 {
    public static void main(String[] args) {

        double db = 36.6;
        float fl = 36.6F;
//        float fl = 36.6; //Помилка компіляції!
//
        System.out.println("Неформатоване виведення");
        System.out.println("db= " + db);//db= 36.6
        System.out.println("fl= " + fl);//fl= 36.6

        System.out.println("\nФорматоване виведення");
        System.out.printf("db= %f%n",db);//db= 36,600000
        System.out.printf("fl= %f%n",fl);//fl= 36,599998
    }
}
