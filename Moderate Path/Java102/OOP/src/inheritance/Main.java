package inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John White", "99999", "john@white.com");
        Academician a1 = new Academician("Thomas Devil", "44444", "thomas@devil.com", "CSE", "Assist. Prof.");
        a1.enter();
        System.out.println(a1.getTitle());
        a1.attendLecture();

        Officer o1 = new Officer("Marry Gross", "33333", "marry@gross.com", "CSE", "Night");
        System.out.println(o1.getFullName()+ " shift is " + o1.getShift());

        TeachingAssistant ta1 = new TeachingAssistant("Daniel Carrot", "76533", "daniel@carrot.com", "CSE", "Teaching Assistant", "C34");
        System.out.println(ta1.getTitle() + " " + ta1.getFullName() + "'s room is " + ta1.getRoomNum());
    }
}
