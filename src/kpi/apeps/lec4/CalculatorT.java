package kpi.apeps.lec4;

/**
 * Узагальнений клас з обмеженням типу
 * @param <E> обмежений тип
 */
public class CalculatorT <E extends Number>{
    private E[] array;

    public CalculatorT(E[] array) {
        this.array = array;
    }

    double sum(){
        double sum=0.0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i].doubleValue();
        }
        return sum;
    }

    // todo: Add methods average(), min(), max()
}
