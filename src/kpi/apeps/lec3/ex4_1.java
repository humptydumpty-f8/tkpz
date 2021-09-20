package kpi.apeps.lec3;


import java.util.Scanner;

/**
 * Введення даних з використанням Scanner
 */
public class ex4_1 {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        System.out.print("Input personal data (name-age-height): ");
        String name = in.next();
        int age = in.nextInt();
        double height = in.nextDouble();
        System.out.printf("%S\n\t ade:%d\t height:%.2f\n", name, age, height);
        in.close();

    }
}
