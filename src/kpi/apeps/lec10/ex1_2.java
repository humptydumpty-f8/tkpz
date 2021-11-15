package kpi.apeps.lec10;
/**
 * Наслідування абстрактпого класу
 */
public class ex1_2 {
    public static void main(String[] args) {

        //Клас-спадкоємець
        class Cat extends Animal{

            //Конструктор
            public Cat() {
                super("cat");
            }

            //Визначення абстрактного методу батьківського класу
            @Override
            String say() {
                return "m-rrr";
            }
        }

        //Сценарій використання
        Cat cat = new Cat();
        System.out.printf("%d. %S < %S\n",cat.getCounter(),cat.kind,cat.say());
    }
}
