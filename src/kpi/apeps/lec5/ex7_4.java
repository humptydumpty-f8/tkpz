package kpi.apeps.lec5;

public class ex7_4 {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10}};

        int value = 11;
        boolean found = false;

        for (int[] x: arr)
            for (int y: x)
                if (y==value){
                    found =true;
                    break;}

    System.out.println(found);
    }
}

