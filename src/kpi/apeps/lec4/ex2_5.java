package kpi.apeps.lec4;

/**
 * Парсінг текстового рядка у вигляді виразу для виконання обчислень
 */
public class ex2_5 {
    public static void main(String[] args) {

        String str="1 + 2 =";
        String[] arr = str.split(" ");
        int sum = Integer.decode(arr[0])+Integer.decode(arr[2]);
        System.out.printf("%s %d",str,sum);
    }
}
