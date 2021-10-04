package kpi.apeps.lec5;

/**
 * Вибір елементу за індексом
 */
public class ex1_2 {

    final static int INDEX_OF_ELEMENT = 1;

    public static void main(String[] args) {

        byte b_arr[] = new byte[] {1,2,3};
        short[] s_arr = {1,2,3};
        int[] i_arr = {1,2,3};
        long l_arr[] = {1,2,3};
        float f_arr[]= {1,2,3};
        double[] d_arr = {1,2,3};
        char[] c_arr = {'1',126,'\u0077'};
        boolean[] bul_arr = {false,true,false};
        String[] str = {"1","2","3"};

        System.out.println(
                "byte " + b_arr[INDEX_OF_ELEMENT] + "\n" +
                "short " + s_arr[INDEX_OF_ELEMENT] + "\n"+
                "int " + i_arr[INDEX_OF_ELEMENT] + "\n" +
                "long " + l_arr[INDEX_OF_ELEMENT] + "\n" +
                "float " + f_arr[INDEX_OF_ELEMENT] + "\n" +
                "double " + d_arr[INDEX_OF_ELEMENT] + "\n" +
                "char " + c_arr[INDEX_OF_ELEMENT] + "\n" +
                "boolean " + bul_arr[INDEX_OF_ELEMENT] + "\n" +
                "String " + str[INDEX_OF_ELEMENT] + "\n" );
    }
}
