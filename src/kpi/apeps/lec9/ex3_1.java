package kpi.apeps.lec9;

/**
 * Статичний поліморфізм (перевантаження методів
 */
public class ex3_1 {

    public static void main(String[] args) {

        // Клас з перевантаженими методами
        class OverloadDemo {

            void test () {
                System.out.println("Параметри відсутні");
            }
            void test(int a) {
                System.out.println("а: " + a);
            }
            void test(int a, int b) {
                System.out .println ("а и b: " + a + " " + b) ;
            }
            double test(double a) {
                System.out.println("double a: " + a);
                return a*a;
            }
        }

        OverloadDemo ob = new OverloadDemo() ;
        double result;

        // Виклик всіх версій перевантажених методів
        System.out.println("\tПеревантажені методи:");
        ob.test () ;
        ob.test (10);
        ob.test (10, 20);
        result = ob.test(123.25) ;
        System.out.println("Результат ob.test(123.25) : " + result);

        // Застосування автоматичного перетворення типів при перевантажені
        System.out.println("\tАвтоматичне перетворення типів:");
        byte i=10;
        ob.test(5*i); //виклик test(int)
        ob.test(123.2);//виклик test(double)

    }
}
