package kpi.apeps.lec8;

/**
 * Клас з різними стратегіями доступу
 */
public class StudentV2 {

    private String fullName;//Read, Write-once
    private String email;//Read, Write
    private boolean isAvtorized; //Read only
    private String password;//Write only

    //Read, Write-once
    public void setFullName(String fullName){

        if (this.fullName == null)this.fullName = fullName;
    }
    public String getFullName(){
        return this.fullName;
    }

    //Read, Write
    void setEmail(String email){
        if (email.matches("(.*)@{1}(.*)"))  this.email=email;
        else this.email=null;
    }

    public String getEmail() {
        return email;
    }

    //Read only
    public boolean isAvtorized() {
        return isAvtorized;
    }

    //Write only
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean doAvtorization(String password){

        return isAvtorized=(this.password==password)?true:false;
    }

    public StudentV2() {
    }

    public StudentV2(String fullName, String email){
        this.setFullName(fullName);
        this.setEmail(email);
    }

    public void showInfo(){

        System.out.printf("%s\t%s\t%b\n",fullName,email,isAvtorized);
    }
}
