package day24AccessModifierEncapsulation;

public class P05_encapsuleClass {
    private String stuName=" not assigned ";
    private String schName="Akil Okullari";
    public String schAdress;
    private String PhoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getSchName(){
       return schName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName){
        this.stuName=stuName;
    }
}
