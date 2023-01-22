package Classes.Pr01;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note = 0;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if(teacher.department.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("Could not give this course");
    }
    void printCourseTeacher() {
        this.teacher.printTeacher();
    }
}
