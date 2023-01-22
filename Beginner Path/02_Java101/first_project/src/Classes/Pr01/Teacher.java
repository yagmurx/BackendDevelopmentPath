package Classes.Pr01;

public class Teacher {
    String name;
    String phone;
    String department;

    Teacher(String name, String phone, String department) {
        this.name = name;
        this.phone = phone;
        this.department = department;
    }

    void printTeacher() {
        System.out.println("Name\t:" + this.name);
        System.out.println("Phone\t: " + this.phone);
        System.out.println("Department\t: "+ this.department);
    }
}
