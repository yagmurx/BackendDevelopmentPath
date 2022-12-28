/**
 * Program that calculates hypotenuse using Pythagorean Theorem
 *
 * @author: Yağmur Yıldız
 * @date: 17 December 2022
 */

package variables;
import java.util.Scanner;
public class Pr03_PythagoreanTheorem {
    public static void main(String[] args) {

        //Initiate variables
        float a,b;
        double c;

        //Initiate Scanner
        Scanner input = new Scanner(System.in);

        //Get values
        System.out.print("Please enter a leg: ");
        a = input.nextFloat();

        System.out.print("Please enter b leg: ");
        b = input.nextFloat();

        //Output
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse is " + c);


    }
}
