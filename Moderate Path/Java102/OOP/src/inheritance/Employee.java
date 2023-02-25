package inheritance;

public class Employee {
    private String fullName;
    private String phoneNum;
    private String email;

    public Employee(String fullName, String phoneNum, String email) {
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void enter() {
        System.out.println(this.fullName + " entered the campus.");
    }
    public void left() {
        System.out.println(this.fullName + " left school." );
    }
    public  void cafeteria() {
        System.out.println(this.fullName + " entered the cafeteria.");
    }
}
