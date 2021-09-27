package kpi.apeps.lec4;

/**
 * Використання узагальненого класа CalculatorT<E>
 */
public class ex6_2 {
    public static void main(String[] args) {

        Integer[] intArr = {1,2,3};
        CalculatorT<Integer> intObj = new CalculatorT<>(intArr);
        System.out.println("Sum of values: "+intObj.sum());

        System.out.println();

        CalculatorT<Double> dblObj = new CalculatorT<>(new Double[]{-1.2, 4., 0.09});        ;
        System.out.println("Sum of values:" + dblObj.sum());


        //todo: Try other E
    }
}
