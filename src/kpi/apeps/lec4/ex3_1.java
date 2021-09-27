package kpi.apeps.lec4;

/**
 * Особливості звужуючого приведення
 */
public class ex3_1 {
    public static void main(String[] args) {

        double numDouble = 100000.111111;
        System.out.println("Double number:" + numDouble);

        System.out.println("To byte: " + (byte) numDouble);//To byte: -96
        System.out.println("To short: " + (short) numDouble);//To short: -31072
        System.out.println("To int: " + (int) numDouble);//To int: 100000
        System.out.println("To long: " + (long) numDouble);//To long: 100000
        System.out.println("To float: " + (float) numDouble);//To float: 100000.11
        System.out.println("To double: " + (double) numDouble);//To double: 100000.111111
        System.out.println("To char: " + (char) numDouble);//To char: 蚠
    }
}
