package kpi.apeps.lec9;

/**
 * Особливість конструктора в Java -
 * у конструкторі дочірнього класу неявно викликається
 * конструктор без параметрів предка
 * Також ілюструється використання ключового слова super
 */
public class ex2_1 {
    public static void main(String[] args) {

        //Батьківській клас без конструктора без параметрів
        class Parent{
            String label;

           public Parent(){}//Коментування цього конструктора унеможливлює створеня дочірніх об'єктів
            public Parent(String label) {
                this.label = label;
            }

            public void print() {
                System.out.println("Parent{" +
                        "label='" + label + '\'' +
                        '}');
            }
        }

        //Дочірній клас
        class Child extends Parent{

            public Child() {
                super.print();//Виклик метода батьківського класу
            }

            public Child(String label) {
                super(label);//Виклик конструктора бвтьківського класу
            }
        }

        //Сценарій роботи програми
        var child = new Child();
        var childLab = new Child("anyText");
        childLab.print();

    }
}
