/**
 * An ATM application where you log in with a username and password.
 * In the program, we can perform withdrawals, deposits, balance viewing, and exit from the system.
 *
 * @author: Yagmur Yildiz
 * @date: 9 Jan '23
 */

package loops;
import java.util.Scanner;
public class Pr09_BasicATM {
    public static void main(String[] args) {
        String userName, password;
        int trial = 3, balance = 1500, select;
        boolean logout = true;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter your User Name: ");
            userName = input.nextLine();
            System.out.print("Enter your Password: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Login Successful");
                System.out.println("Welcome to X Bank");

                do {
                    System.out.println("1 - Withdrawal\n" +
                                        "2 - Deposit\n" +
                                        "3 - Balance Inquiry\n" +
                                        "4 - Log out\n" +
                                        "===========================");
                    System.out.print("Select a transaction: ");
                    select = input.nextInt();
                    switch(select) {
                        case 1:
                            System.out.print("Withdraw Amount: ");
                            int amount = input.nextInt();
                            balance += amount;
                            break;

                        case 2:
                            System.out.print("Deposit Amount: ");
                            amount = input.nextInt();
                            if (amount > balance)
                                System.out.println("Insufficient balance ");
                            else
                                balance -= amount;
                            break;

                        case 3:
                            System.out.println("Your Balance: " + balance);
                            break;
                    }
                } while(select != 4);
                System.out.println("See you soon!");
                break;
            }

            else {
                trial--;
                System.out.println("Wrong Identity");
                if (trial == 0)
                    System.out.println("Your Account is blocked");
                else
                    System.out.println("Your trial: "+ trial);
            }

        } while(trial != 0);
    }
}