package Project_Adventure_Game;

public abstract class Location {
    private Player player;
    private String name;

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public abstract boolean atLocation();
}
