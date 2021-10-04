package kpi.apeps.lec5;

/**
 * Спроба перегляду масиву методом toString()
 */
public class ex1_4 {

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
                "byte " + b_arr.toString() + "\n" +
                "short " + s_arr.toString() + "\n"+
                "int " + i_arr.toString() + "\n" +
                "long " + l_arr.toString() + "\n" +
                "float " + f_arr.toString() + "\n" +
                "double " + d_arr.toString() + "\n" +
                "char " + c_arr.toString() + "\n" +
                "boolean " + bul_arr.toString() + "\n" +
                "String " + str.toString() + "\n" );
    }
}
