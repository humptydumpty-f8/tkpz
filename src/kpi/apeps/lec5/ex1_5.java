package kpi.apeps.lec5;

/**
 * Визначення унікальних обєктів методом toString та hashCode
 */
public class ex1_5 {

    public static void main(String[] args) {

        int[] foo = new int[3];
        int[] bar = foo;
        int[] bis = new int[3];

        System.out.println("foo: " + foo.toString() + "\n" +
                "bar: " + bar.toString() + "\n" +
                "bis: " + bis.toString());

        System.out.println();

        System.out.println("foo: " + foo.hashCode() + "\n" +
                "bar: " + bar.hashCode() + "\n" +
                "bis: " + bis.hashCode());

        System.out.println();

        System.out.println("foo: " + Integer.toHexString(foo.hashCode()) + "\n" +
                "bar: " + Integer.toHexString(bar.hashCode()) + "\n" +
                "bis: " + Integer.toHexString(bis.hashCode()));

    }
}
