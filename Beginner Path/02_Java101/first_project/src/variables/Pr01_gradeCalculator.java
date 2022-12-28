/**
 * Program an average calculator
 * that calculates the semester average by
 * taking the grade of 6 courses.
 *
 * @author: Yağmur Yıldız
 * @date: 17 Dec 2022
 */



package variables;
import java.util.Scanner;
public class Pr01_gradeCalculator {
    public static void main(String[] args) {
        //Variables
        int math, phys, chem, eng, his, elec;

        //Scanner class
        Scanner input = new Scanner(System.in);

        //Get grades
        System.out.print("Math Grade: ");
        math = input.nextInt();

        System.out.print("Physics Grade: ");
        phys = input.nextInt();

        System.out.print("Chemistry Grade: ");
        chem = input.nextInt();

        System.out.print("English Grade: ");
        eng = input.nextInt();

        System.out.print("History Grade: ");
        his = input.nextInt();

        System.out.print("Elective Grade: ");
        elec = input.nextInt();

        double avr = (math + phys + chem + eng + his + elec) / 6.0;
        System.out.print("Your Average is: " + avr);
    }
}
