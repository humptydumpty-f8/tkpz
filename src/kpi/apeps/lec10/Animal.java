package kpi.apeps.lec10;

/**
 * Абстрактний клас з лічильником екземплярів
 */
public abstract class Animal{

    static protected int counter;//Лічильник
    protected String kind;//Вид тварини
    abstract String say();//Абстрактний метод

    //Гетер лічильника
    public int getCounter() {
        return counter;
    }

    //Статичний ініціалізатор
    static {counter = 10;}

    //Конструктор з параметром
    public Animal(String kind) {
        this.kind = kind;
        this.counter++;
    }
}
