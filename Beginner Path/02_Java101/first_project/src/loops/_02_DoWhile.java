package loops;
import java.util.Scanner;
public class _02_DoWhile {
    public static void main(String[] args) {
        int pass;
        boolean access = true;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter your password: ");
            pass = input.nextInt();
            if(pass == 123) {
                System.out.println("Doğru");
                access = false;
            } else {
                System.out.println("Yanlış");
            }
        }while (access);
    }
}
