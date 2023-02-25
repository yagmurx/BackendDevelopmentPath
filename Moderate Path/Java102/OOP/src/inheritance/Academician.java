package inheritance;

public abstract class Academician extends Employee {
    private String department;
    private String title;
    public Academician(String fullName, String phoneNum, String email, String department, String title) {
        super(fullName, phoneNum, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void attendLecture(String Time);

    @Override
    public void enter() {
        System.out.println(this.getTitle() + " " + this.getFullName() + " entered the campus.");
    }
}
