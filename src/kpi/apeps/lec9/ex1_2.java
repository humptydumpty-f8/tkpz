package kpi.apeps.lec9;

/**
 * Відношення реалізації між класами
 * Клас Car реалізує інтерфейс IMovable
 */
public class ex1_2 {

    //Інтерфейс
    private interface IMovable{
        void move();
    }

    //Клас реалізації
    static class Car implements IMovable {
        public void move(){

            System.out.println("Рухаємось!!!");
        }
    }

    public static void main(String[] args) {

        (new Car()).move();//Виклик реалізованого методу
    }
}
