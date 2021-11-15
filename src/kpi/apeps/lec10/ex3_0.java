package kpi.apeps.lec10;

/**
 * Статичний вкладений клас
 */

//Зовнішній клас
class Car {

    //Поля
    private int manufactureYear;
    private String model;

    //Конструктор
    public Car (int manufactureYear, String model) {
        this.manufactureYear = manufactureYear;
        this.model = model;
    }

    //Статичний вкладений клас з кресленнями
    public static class Drawing {
        public void show() {
            System.out.println("Show draving");
        }
    }
}

public class ex3_0 {

    public static void main(String[] args) {
        new Car.Drawing().show();//виклик методу статичного класу
    }
}
