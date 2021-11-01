package kpi.apeps.lec7;

/**
 * Робота ініціалізатора
 */
public class ex1_2 {

    public static void main(String[] args) {

        Student st1=new Student();
        st1.getInfo();//so-and-so 	 undefined
        Student st2=new Student("Pupkin");
        st2.getInfo();//Pupkin 	 undefined
        Student st3=new Student("Pupkin","TВ-91");
        st3.getInfo();//Pupkin 	 TВ-91
    }
}
