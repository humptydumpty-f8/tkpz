package kpi.apeps.lec5;

/**
 * Властивість length
 */
public class ex1_3 {

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
                "byte " + b_arr.length + "\n" +
                "short " + s_arr.length + "\n"+
                "int " + i_arr.length + "\n" +
                "long " + l_arr.length + "\n" +
                "float " + f_arr.length + "\n" +
                "double " + d_arr.length + "\n" +
                "char " + c_arr.length + "\n" +
                "boolean " + bul_arr.length + "\n" +
                "String " + str.length + "\n" );
    }
}
