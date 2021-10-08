package kpi.apeps.lec5;

/*Вычисление суммы последовательных чисел*/
public class ex5_5 {

    final static int MIN_BOUND = 0;
    final static int MAX_BOUND = 3;

    public static void main(String[] args) {

        int sum=0;
        for (
                int k = MIN_BOUND;
                ++k <= MAX_BOUND;
                sum+=k) ;
        System.out.print("sum = " + sum);
    }
}