/**
 *  Text-based MineSweeper Game
 *  All program is written by me.
 *
 * @author: Yagmur YILDIZ
 * @date: 30 Jan '23
 */

package Project_MineSweeper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the row number: ");
        int row = input.nextInt();
        System.out.print("Please enter the column number: ");
        int col = input.nextInt();
        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
