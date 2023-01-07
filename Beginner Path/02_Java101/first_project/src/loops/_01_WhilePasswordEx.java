package loops;
import java.util.Scanner;
public class _01_WhilePasswordEx {
    public static void main(String[] args) {
        int pass = 1234, enterPass;
        boolean access = false;

        Scanner input = new Scanner(System.in);

        while(!access) {
            System.out.print("Enter your password: ");
            enterPass = input.nextInt();

            if(enterPass == pass)
                access = true;
        }
        System.out.println("Login successful");
    }
}
