package kpi.apeps.lec7;

/**
 * Клас як тип і модуль одночасно
 */
public class StudentV1 {
    final static String UNIVERSITY_NAME="Igor Sikorsky Kyiv Polytechnic Institute";
    final  String DEPARTMENT="Heat power faculty";

    String fullName;
    String group;
    static int counter;

    /*начало блока инициализатора*/
    {
        fullName = "so-and-so";
        group = "undefined";
    }
    /*конец блока инициализатора*/

    /*начало блока статической инициализатора*/
    static{
        counter = 10;
    }
    /*конец блока статической инициализатора*/


    StudentV1(){
        ++counter;
    }
    StudentV1(String fullName){
        this.fullName=fullName;
        ++counter;
    }

    StudentV1(String fullName, String group){
        this.fullName=fullName;
        this.group=group;
        ++counter;
    }
    void getInfo(){

        System.out.printf("%s \t %s \t %d \n", fullName,group,counter);
    }
    static void printUnivName(){

        System.out.printf("%s%n", UNIVERSITY_NAME);
    }

    protected void finalize() throws Throwable
    {
        System.out.println(fullName + " destroyed");
    }

}
