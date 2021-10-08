package kpi.apeps.lec5;

public class ex6_2 {

    static final int MIN = 10;
    static final int MAX = 20;

    public static void main(String[] args) {
        int i=MIN, j=MAX;
        while (++i<--j);//Пустой цикл
        System.out.println("Awerage value: " + i);
    }
}