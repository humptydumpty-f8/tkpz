package kpi.apeps.lec9;

/**
 * Відношення агрегації між класами
 * Клас Bike агрегує клас Beep
 */

public class ex1_5 {
    public static void main(String[] args) {

        //Підлеглий клас
        class Beep {
            int power;

            public Beep(int power) {
                this.power = power;
            }
        }

        //клас-агрегатор
        class Bike {
            String model;
            Beep beep;

            public Bike(Beep beep) {
                this.model = "Java";
                this.beep = beep;//Утворення "слабкого"  звязку
            }
        }

        Beep beep = new Beep(300);
        Bike bike = new Bike(beep);
        System.out.println("Bike " +
                bike.model +
                ": " +
                bike.beep.power);
    }
}
