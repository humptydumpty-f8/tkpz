package kpi.apeps.lec5;

public class ex7_3 {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10}};

        for (int[] x: arr)
            for (int y: x)
                System.out.println(y);
    }
}
