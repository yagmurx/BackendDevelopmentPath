package inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John White", "99999", "john@white.com");
        //Academician a1 = new Academician("Thomas Devil", "44444", "thomas@devil.com", "CSE", "Assist. Prof.");
        //a1.enter();
        //System.out.println(a1.getTitle());
        //a1.attendLecture();

        Officer o1 = new Officer("Marry Gross", "33333", "marry@gross.com", "CSE", "Night");
        System.out.println(o1.getFullName()+ " shift is " + o1.getShift());

        TeachingAssistant ta1 = new TeachingAssistant("Daniel Carrot", "76533", "daniel@carrot.com", "CSE", "Teaching Assistant", "C34");
        System.out.println(ta1.getTitle() + " " + ta1.getFullName() + "'s room is " + ta1.getRoomNum());

        // OVERRIDING
        System.out.println("================ Overriding Example ================");
        e1.enter();
        //a1.enter();
        o1.enter();
        ta1.enter();

        // POLYMORPHISM
        System.out.println("================ Polymorphism Example ================");
        Employee[] Queue = {e1, o1, ta1};
        Employee.enteredEmployees(Queue);

        // ABSTRACTION
        System.out.println("================ Abstraction Example ================");
        ta1.attendLecture("14.30");
    }
}
