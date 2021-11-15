package kpi.apeps.lec10;

/**
 * Розташування статичного вкладеного класу в класі з точкою входу
 */
public class ex3_2 {

    //Статичний вкладений клас
    static class Operation{
        static int min(int x, int y){return x>=y?y:x;}//статичний метод
        int max(int x, int y){return x>=y?x:y;}//нестатичний метод
    }

    public static void main(String[] args) {

        Operation oper = new Operation();//створення екземпляру
        System.out.println("min = " + Operation.min(2,3));//виклик статичного методу
        System.out.println("max = " + oper.max(2,3));//виклик нестатичного методу
    }
}
