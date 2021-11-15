package kpi.apeps.lec10;

/**
 * Анонімний внутрішній клас як реалізація класу
 */
public class ex6_2 {
    public static void main(String[] args) {

        //Анонімний внутрішній клас як реалізація абстрактного класу
        var tiger = new Animal("tiger") {
            @Override
            String say() {
                return "R-r-r-r!";
            }
        };

        System.out.println("Tiger say: " + tiger.say());
    }
}
