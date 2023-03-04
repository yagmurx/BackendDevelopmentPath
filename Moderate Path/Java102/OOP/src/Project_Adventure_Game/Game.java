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
            System.out.println("You are at: "+ location.getName());
            System.out.println("Where do you want to go?");
            System.out.println("""
                    1 - Safe House
                    2 - Store
                    3 - Cave
                    4 - Forest
                    5 - River
                    0 - Exit Game""");
            System.out.print("Select a location: ");
            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new LocSafeHouse(player);
                    break;
                case 2:
                    location = new LocStore(player);
                    break;
                case 3:
                    if(player.getInventory().isFood()) {
                        System.out.println("You already cleaned the Cave.");
                        location = new LocSafeHouse(player);
                    }else {
                        location = new LocCave(player);
                    }
                    break;
                case 4:
                    if(player.getInventory().isFirewood())  {
                        System.out.println("You already cleaned the Forest.");
                        location = new LocSafeHouse(player);
                    }else {
                        location = new LocForest(player);
                    }
                    break;
                case 5:
                    if(player.getInventory().isWater()) {
                        System.out.println("You already cleaned the River.");
                        location = new LocSafeHouse(player);
                    }else {
                        location = new LocRiver(player);
                    }
                    break;
                default:
                    location = null;
            }
            if(location == null) {
                System.out.println("YOU GIVE UP, GAME OVER! ");
                break;
            }
            if(location.getName() == "Safe House") {
                if(player.getInventory().isWater() && player.getInventory().isFood() && player.getInventory().isFirewood()) {
                    System.out.println("YOU WON THE GAME!");
                    break;
                }
            }
            if(! location.atLocation()) {
                System.out.println("YOU LOST, GAME OVER! ");
                break;
            }
        }
    }
}
