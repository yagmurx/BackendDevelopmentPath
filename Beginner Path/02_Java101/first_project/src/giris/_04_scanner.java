package giris;
import java.util.Scanner;
public class _04_scanner {
    public static void main(String[] args) {
        int num;
        System.out.print("Sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        System.out.println(num);

    }
}
