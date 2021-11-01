package kpi.apeps.lec8;
// подключина библиотека NumOperations.jar
import kpi.apeps.lec7.NumOperations;

/**
 * Імпорт методів із завнішньої бібліотеки у вигляді jar-файла
 */

public class ex1_9 {
    public static void main(String[] args) {

        System.out.println(NumOperations.PI);//3.1456
        System.out.println(NumOperations.sum(1,2));//3
        System.out.println(NumOperations.subtract(1,2));//-1
        System.out.println(NumOperations.multiply(1,2));//2
        System.out.println(NumOperations.name);//null
    }
}
