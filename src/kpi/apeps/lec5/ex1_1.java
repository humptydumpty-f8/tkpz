package kpi.apeps.lec5;

/**
 * Ініціалізація масивів значеннями за замовчуванням
 */
public class ex1_1 {

    final static int ARRAY_DIMENTIONS = 3;

    public static void main(String[] args) {

        byte b_arr[];
        b_arr = new byte[ARRAY_DIMENTIONS];

        short[] s_arr = new short[ARRAY_DIMENTIONS];
        int[] i_arr = new int[ARRAY_DIMENTIONS];
        long l_arr[] = new long[ARRAY_DIMENTIONS];
        float f_arr[]= new float[ARRAY_DIMENTIONS];
        double[] d_arr = new double[ARRAY_DIMENTIONS];
        char[] c_arr = new char[ARRAY_DIMENTIONS];
        boolean[] bul_arr = new boolean[ARRAY_DIMENTIONS];
        String[] str = new String[ARRAY_DIMENTIONS];

        System.out.println(
                "byte " + b_arr[1] + "\n" +
                "short " + s_arr[1] + "\n"+
                "int " + i_arr[1] + "\n" +
                "long " + l_arr[1] + "\n" +
                "float " + f_arr[1] + "\n" +
                "double " + d_arr[1] + "\n" +
                "char " + c_arr[1] + "\n" +
                "boolean " + bul_arr[1] + "\n" +
                "String " + str[1] + "\n" );
    }
}
