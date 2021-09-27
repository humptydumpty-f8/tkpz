package kpi.apeps.lec4;

/**
 * Використання узагальненого класа PrinterBox<T>
 */
public class ex6_1 {
    public static void main(String[] args) {

        PrinterBox<Integer> intObj = new PrinterBox<>(10);
        intObj.print();
        System.out.println();

        PrinterBox<Double> dblObj = new PrinterBox<>(10.50);
        dblObj.print();
        System.out.println();

        PrinterBox<Character> chrObj = new PrinterBox<>('w');
        chrObj.print();
        System.out.println();

        PrinterBox<Boolean> blnObj = new PrinterBox<>(true);
        blnObj.print();
        System.out.println();

        PrinterBox<PrinterBox> prtObj = new PrinterBox<>(new PrinterBox<>(10));
        prtObj.print();
        System.out.println();

        //todo: Add other Т

    }
}
