package kpi.apeps.lec9;

/**
 * Відношення композиції між класами
 * Клас ElectricCar утворює композицію з класом ElectricEngine
 */

public class ex1_4 {
    public static void main(String[] args) {

        //Залежний клас
        class ElectricEngine{
            int power;
            public ElectricEngine(int power) {
                this.power = power;
            }
        }

        //Клас-композиція
        class ElectricCar {
            String model;
            ElectricEngine engine;

            public ElectricCar(){
                this.model = "Tesla";
                this.engine = new ElectricEngine(310);//Утворення "сильного"  звязку
            }
        }

        ElectricCar electricCar = new ElectricCar();

        System.out.println("ElectricCar " + electricCar.model +": " +
                electricCar.engine.power);
    }
}
