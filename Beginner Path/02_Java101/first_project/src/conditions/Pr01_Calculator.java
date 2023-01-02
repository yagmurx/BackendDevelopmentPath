/**
 *  Basic math calculator
 *
 * @author: Yagmur Yildiz
 * @date: 1 January 2023
 */
package conditions;
import java.util.Scanner;

public class Pr01_Calculator {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("Enter number of your selection: ");
        select = input.nextInt();

        System.out.println(select);

        switch (select) {
            case 1:
                System.out.println("Addition: " + (num1+num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1*num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("Division: " + (num1/num2));
                } else {
                    System.out.println("0 Exception");
                }
                break;
            default:
                System.out.println("Wrong selection");
        }
    }
}
