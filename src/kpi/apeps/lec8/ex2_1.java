package kpi.apeps.lec8;

class Modifier {
    String defolt;
    private String priv;
    protected String prot;
    public String pub;
}
/**
 * Вплив модифікаторів достуру в межах пакету
 */
public class ex2_1 {

    public static void main(String[] args) {

        var modifier = new Modifier();

        modifier.defolt = "Defolt";
       // modifier.priv="Private";//Недоступне поле
        modifier.prot = "Protected";
        modifier.pub ="Public";
    }
}
