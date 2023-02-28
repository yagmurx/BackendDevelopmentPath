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
                               "\n2 - Store" +
                               "\n3 - Cave" +
                               "\n4 - Forest" +
                               "\n5 - River" +
                               "\n0 - Exit Game");
            System.out.print("Select a location: ");
            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new LocSafeHouse(player);
                    break;
                case 2:
                    location = new LocStore(player);
                    break;
                case 3:
                    location = new LocCave(player);
                    break;
                case 4:
                    location = new LocForest(player);
                    break;
                case 5:
                    location = new LocRiver(player);
                    break;
                default:
                    location = null;
            }
            if(location == null) {
                System.out.println("YOU GIVE UP, GAME OVER! ");
                break;
            }
            if(! location.atLocation()) {
                System.out.println("YOU LOST, GAME OVER! ");
                break;
            }
            System.out.println("====================================================");
        }
    }
}
