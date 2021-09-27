package kpi.apeps.lec4;

/**
 * Узагальнений клас
 * @param <T> будь-який посилальний тип
 */
public class PrinterBox<T> {
    private T t;

    public PrinterBox(T type) {
        this.t = type;
    }

    public T getT() {
        return t;
    }

    void print() {
        System.out.println("Value:\t" + getT() + "\n" +
                "Type:\t" + t.getClass().getName());
    }
}
