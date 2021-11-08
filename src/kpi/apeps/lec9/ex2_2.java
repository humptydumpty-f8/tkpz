package kpi.apeps.lec9;

/**
 * Розширення та звуження типу
 */
public class ex2_2 {

    public static void main(String[] args) {

        //Батьківський клас
        class A {
            A(){}

            void start(){
                System.out.println("Start method from A");
            }
            void finish(){
                System.out.println("Finish method from A");
            }
        }

        //Клас-нащадок з перевизначеним методом
        class B extends A {
            B(){super();}

            @Override
            void start() {
                System.out.println("Start method from B");
            }

            void stop() {
                System.out.println("Stop method from B");
            }
        }

        //Розширення типу
        A objA = new B();
        objA.start();//"Start method from B"
        objA.finish();//"Finish method from А"

        //Звуження типу
        B objB = new B();
        if (objA instanceof B) objB=(B)objA;
        objB.start();//"Start method from B"
        objB.finish();//"Finish method from А"
        objB.stop();//"Stop method from B"
    }
}
