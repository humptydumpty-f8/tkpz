package kpi.apeps.lec10;

/**
 * Імплементація інтерфейсу Colorable для виведення тексту різними кольорами
 */
public class ex2_2 implements Colorable {
    public static void main(String[] args) {

        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "This text is green!" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "This text is blue!" + ANSI_RESET);
    }
}
