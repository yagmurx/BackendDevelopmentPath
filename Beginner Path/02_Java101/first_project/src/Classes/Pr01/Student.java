package Classes.Pr01;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String ID;
    String level;
    double average;
    boolean isPass;

    Student(String name, String ID, String level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
    }
    void addCourses (Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addExamNote(int note1, int note2, int note3) {
        if(note1 >= 0 && note1 <= 100)
            this.c1.note = note1;
        if(note2 >= 0 && note2 <= 100)
            this.c2.note = note2;
        if(note3 >= 0 && note3 <= 100)
            this.c3.note = note3;
    }

    void printNotes() {
        System.out.println(this.c1.name + " Grade: "+ this.c1.note);
        System.out.println(this.c2.name + " Grade: "+ this.c2.note);
        System.out.println(this.c3.name + " Grade: "+ this.c3.note);
    }

    void average() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
    }

    void isPass() {
        average();
        if(this.average > 55) {
            this.isPass = true;
            System.out.println("Passed");
        }
        else {
            this.isPass = false;
            System.out.println("Failed");
        }

    }
}
