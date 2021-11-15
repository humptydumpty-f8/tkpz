package kpi.apeps.lec10;

/**
 * Створення "екземплярів" абстрактного класу
 */
public class ex1_1 {
    public static void main(String[] args) {

        //Анонімний клас методу
        Animal animal1 = new Animal("cat") {
            @Override
            String say() {
                return "m-rrr";
            }
        };
        System.out.printf("%d. %S < %S\n",animal1.getCounter(),animal1.kind,animal1.say());

        //Анонімний клас методу
        Animal animal2 = new Animal("dog") {
            @Override
            String say() {
                return "gav-vvv";
            }
        };
        System.out.printf("%d. %S < %S\n",animal2.getCounter(),animal2.kind,animal2.say());
    }
}
