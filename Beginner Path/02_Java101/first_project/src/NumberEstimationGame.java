import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class NumberEstimationGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int live = 5;
        int[] wrongEst = new int[live];

        while(live != 0) {
            System.out.print("Please enter your estimation: ");
            int est = input.nextInt();

            if(!(est >=0 && est<=99)) {
                System.out.println("Please enter a number between 0 to 99");
            }
            else {
                if(est == number) {
                    System.out.println("Congrats!");
                    break;
                }
                else {
                    wrongEst[(5 - live)] = est;
                    live--;
                    System.out.println("Wrong estimation. Your lives: " + live);
                    if (est > number)
                        System.out.println(est + " is bigger than number.");
                    else
                        System.out.println(est + " is smaller than number");
                }
            }


        }
        if(live == 0) {
            System.out.println("Game over! \nNumber is: " + number);
            System.out.println("Your estimations: " + Arrays.toString(wrongEst));
        }
    }
}
