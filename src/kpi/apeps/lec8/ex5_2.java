package kpi.apeps.lec8;


import com.google.gson.Gson;

/**
 * Використання бібліотеки Google Gson
 */
public class ex5_2 {

    //Тестовий клас користувача
    static class User {
        String name;
        int age;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {

        //Створюємо екземпляр користувача
        User user = new User();
        user.name = "Pupkin";
        user.age = 20;

        //Створюємо екземпляр Gson
        Gson gson = new Gson();

        //Серіалізуємо користувача в JSON
        String JSON  = gson.toJson(user);
        System.out.println (JSON);

        //Створюємо екземпляр  користувача на основі строки JSON
        User userTwo = gson.fromJson(JSON, User.class);
        System.out.println (userTwo);

    }
}
