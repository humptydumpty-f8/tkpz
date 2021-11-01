package kpi.apeps.lec8;

/**
 * Використання стратегій доступу, реалізованих в класі StudentV2
 */
public class ex3_1 {
    public static void main(String[] args) {

        var st1 = new StudentV2();

        st1.setFullName("Pupkin");
        st1.setEmail("Pupkin@gmail.com");
        st1.setPassword("111");
        st1.doAvtorization("111");
        st1.showInfo();

        st1.setFullName("Sutkin");
        st1.setEmail("Sutkin.gmail.com");
        st1.setPassword("111");
        st1.doAvtorization("112");
        st1.showInfo();

        StudentV2 st2 = new StudentV2("Lutkin","gmail.com");
        st2.showInfo();
    }
}
