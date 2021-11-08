package kpi.apeps.lec9;

/**
 * Динамічний поліморфізм (перевизначення методів)
 */
public class ex4_1 {

    public static void main(String[] args) {

        //Батьківський клас
        class A {
            A(){}
            void start(){
                System.out.println("Start method from A");
            }
        }

        //Клас-нащадок
        class B extends A {
            B(){super();}
            //Перевизначення методу
            @Override
            void start() {
                System.out.println("Start method from B");
            }
        }


        B objB = new B();
        //Виклик перевизначеного методу
        objB.start();//"Start method from B"

    }
}
