package Project_Adventure_Game;

import java.util.Scanner;
public class Game {
    private Scanner input = new Scanner(System.in);
    public void start() {
        System.out.println("Game Started");
        System.out.print("Please enter player name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " welcome to game!");
        player.selectCharacter();
    }
}
