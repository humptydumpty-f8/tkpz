package kpi.apeps.lec9;

/**
 * Відношення спадкування між класами
 * Клас Manager успадковує клас User
 */
public class ex1_1 {

    //Батьківський клас
    static class User {
        int id;
        String name;

        public void print() {
            System.out.println("User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}');
        }
    }

    //Клас-спадкоємець
    static class Manager extends User {
        String company;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.id =1; //Успадковане поле
        manager.name = "Pupkin"; //Успадковане поле
        manager.company = "Microsoft";
        manager.print();//Успадкований метод
    }
}
