/**
 * Basic Login Area
 *
 * @author: Yagmur Yildiz
 * @date: 2 January 2023
 */

package conditions;
import java.util.Scanner;
public class Pr02_LoginArea {
    public static void main(String[] args) {
        String userName, pass;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        userName = input.nextLine();
        System.out.print("Enter your password: ");
        pass = input.nextLine();

        if(userName.equals("patika") && pass.equals("java123")) {
            System.out.println("Correct");
        } else {
            System.out.println("False");
        }
    }
}
