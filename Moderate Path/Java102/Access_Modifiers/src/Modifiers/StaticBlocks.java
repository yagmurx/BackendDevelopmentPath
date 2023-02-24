package Modifiers;
import java.util.Scanner;

// HackerRank Challenge
public class StaticBlocks {
    static int B, H;
    static boolean flag;

    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();

        if(B>0 && H>0)
            flag = true;
        else
            System.out.println("B and H must be greater than zero");
    }

    public static void main(String[] args) {
        if(flag) {
            int area = B*H;
            System.out.println(area);
        }


    }
}
