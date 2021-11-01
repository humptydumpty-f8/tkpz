package kpi.apeps.lec7;

/**
 * Клас з фабричними методами
 */
public class Fabrika {
    int width;
    int height;

    static Fabrika withWidth(int width)
    {
        Fabrika fabrika=new Fabrika();
        fabrika.width=width;
        return fabrika;
    }
    static Fabrika withHeight(int height)
    {
        Fabrika fabrika=new Fabrika();
        fabrika.height=height;
        return fabrika;
    }

    @Override
    public String toString() {
        return "Fabrika{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
