package loops;
import java.util.Scanner;
public class Pr05_PowerFunc {
    public static void main(String[] args) {
        int num, pow;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter the power: ");
        pow = input.nextInt();

        // =========== with while loop ===========
        int count=1, res=1;
        while(count <= pow) {
            res *= num;
            count++;
        }
        System.out.println("Result with while loop: " + res);

        res = 1;
        // =========== with for loop ===========
        for(int i=1; i<=pow; i++)
            res *= num;

        System.out.println("Result with for loop: " + res);
    }
}
