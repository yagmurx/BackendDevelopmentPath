package Classes.Pr01;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Koch J.", "12345", "CHEM");
        Teacher t2 = new Teacher("Butterworth M.", "54321", "MATH");
        Teacher t3 = new Teacher("Butcher K.", "99778", "HIS");

        Course Chem = new Course("Chemistry", "CHEM101", "CHEM");
        Chem.addTeacher(t1);
        Course Math = new Course("Mathematics", "MATH101", "MATH");
        Math.addTeacher(t2);
        Course His = new Course("History", "HIS101", "HIS");
        His.addTeacher(t3);

        Student s1 = new Student("Wolf A.", "8883223", "Third");
        s1.addCourses(Chem, Math, His);
        s1.addExamNote(55, 70, 90);

        s1.printNotes();
        s1.isPass();

        Student s2 = new Student("Black A.", "665531", "Third");
        s2.addCourses(Chem, Math, His);
        s2.addExamNote(55, 40, 35);

        s2.printNotes();
        s2.isPass();

        if(s1.isPass && s2.isPass)
            System.out.println("Class is successes");
        else
            System.out.println("Class is failed");

    }
}
