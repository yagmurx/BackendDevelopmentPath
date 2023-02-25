package inheritance;

public class Officer extends Employee {
    private String department;
    private String shift;

    public Officer(String fullName, String phoneNum, String email, String department, String shift) {
        super(fullName, phoneNum, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getFullName() + " at the office.");
    }
}
