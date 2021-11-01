package kpi.apeps.lec7;
/**
 * Робота метода finalize()
 */

public class ex1_3 {

    public static void main(String[] args) {

        MyClass my = new MyClass("Example #1");
        my=null;
        System.gc();//запросить сборку мусора
    }
}
