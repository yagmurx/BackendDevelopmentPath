/**
 * Program that calculate perimeter & area of a circle from radius.
 *
 * @author: Yagmur Yildiz
 * @date: 25 December 2022
 */
package giris;
import java.util.Scanner;

public class Pr05_CircleCalculator {
    public static void main(String[] args) {
        //Variables
        float radius=0, pi=3.14F, per=0, area=0;

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        radius = input.nextFloat();

        //Calculation
        per = 2*pi*radius;
        area = pi*radius*radius;

        //Output
        System.out.println("Perimeter of the circle: " + per);
        System.out.println("Are of the circle: " + area);



    }
}
