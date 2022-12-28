/**
 * A program that calculates body mass index by inputs.
 *
 * @author: Yagmur Yildiz
 * @date: 25 December 2022
 */

package variables;
import java.util.Scanner;
public class Pr06_BodyMassIndexCalculator {
    public static void main(String[] args) {
        //Variables
        float height=0, weight=0, bmi=0;

        //Input
        Scanner in_h = new Scanner(System.in);
        Scanner in_w = new Scanner(System.in);

        System.out.print("Please enter your height in meter: ");
        height = in_h.nextFloat();
        System.out.print("Please enter your weight in meter: ");
        weight = in_w.nextFloat();

        // Calculation
        bmi = weight / (height*height);

        //Output
        System.out.println("Your BMI is " + bmi);
    }
}
