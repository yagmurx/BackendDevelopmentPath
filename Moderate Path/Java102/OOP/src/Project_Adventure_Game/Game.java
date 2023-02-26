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

        Location location = new LocSafeHouse(player);
        while(true) {
            player.printInfo();
            System.out.println("====================================================");
            System.out.println("You are at: "+ location.getName());
            System.out.println("Where do you want to go?");
            System.out.println("1 - Safe House" +
                                "\n2 - Store");
            System.out.print("Select a location: ");
            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new LocSafeHouse(player);
                    break;
                case 2:
                    location = new LocStore(player);
                    break;
                default:
                    location = new LocSafeHouse(player);
            }
            if(! location.atLocation()) {
                System.out.println("Game Over");
                break;
            }
            System.out.println("====================================================");
        }
    }
}
