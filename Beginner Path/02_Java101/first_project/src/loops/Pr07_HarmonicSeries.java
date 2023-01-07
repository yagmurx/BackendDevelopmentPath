package loops;
import java.util.Scanner;
public class Pr07_HarmonicSeries {
    public static void main(String[] args) {
        int num;
        double harmonic = 0F;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        for(int i=1; i<=num; i++) {
            harmonic += (1.0/i);

        }
        System.out.println("Result: " + harmonic);
    }
}
