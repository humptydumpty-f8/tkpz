package kpi.apeps.lec5;

/*Отоображение диагональных элнментов*/
public class ex5_6 {

    final static int nums[][]= {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
    };

    public static void main(String[] args) {

        for (int i=0, j =0;
             i < nums.length && j<nums[i].length;
             j++,i=j )
            System.out.println(nums[i][j]);
    }
}