package kpi.apeps.lec7;
/**
 * Створення обєктів фабричними методами
 */

public class ex1_4 {

    public static void main(String[] args) {

        Fabrika fabrikaWithWidth= Fabrika.withWidth(10);
        System.out.println(fabrikaWithWidth);

        Fabrika fabrikaWithHeight= Fabrika.withHeight(100);
        System.out.println(fabrikaWithHeight);

    }
}
