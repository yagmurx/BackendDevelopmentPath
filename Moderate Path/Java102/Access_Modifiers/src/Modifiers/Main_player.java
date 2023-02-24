package Modifiers;

public class Main_player {
    public static void main(String[] args) {
        player p1 = new player("John White", 1);
        p1.login();
        System.out.println(p1.name);
        System.out.println(p1.game );

        player p2 = new player("Marry Ford", 2);
        p2.login();

        System.out.println(player.count );

    }
}
