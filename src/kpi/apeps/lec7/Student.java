package kpi.apeps.lec7;

/**
 * Клас з блоком ініціалізації
 */
public class Student {
    final String UNIVERSITY_NAME="Igor Sikorsky Kyiv Polytechnic Institute";
    final String DEPARTMENT="Heat power faculty";

    String fullName;
    String group;

    /*начало блока инициализатора*/
    {
        fullName = "so-and-so";
        group = "undefined";
    }
    /*конец блока инициализатора*/

    public Student(){
    }
    public Student(String fullName){
        this.fullName=fullName;
    }

    public Student(String fullName, String group){
        this.fullName=fullName;
        this.group=group;
    }
    public void getInfo(){

        System.out.printf("%s \t %s\n", fullName,group);
    }
    void printUnivName(){

        System.out.printf("%s", UNIVERSITY_NAME);
    }
    protected void finalize() throws Throwable
    {
        System.out.println(fullName + " destroyed");
    }

}
