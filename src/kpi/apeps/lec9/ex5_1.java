package kpi.apeps.lec9;

/**
 * Фіналізація методу та класу
 */
public class ex5_1 {
    public static void main(String[] args) {

        class А {

            //Фіналізований метод
            final void meth() {
                System.out.println(" Этo завершенный метод . ");
            }
        }

        //Фіналізований клас
        final class В extends А {
            // Цей метод не може перевизначатись
            //void meth ( ) {System.out.println ( " Помилка! " ) ;
        }

        //Клас B не може мати підкласи
        //class C extends В {}
    }
}
