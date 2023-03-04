package Project_Adventure_Game;

public class LocSafeHouse extends SafeLocation {
    public LocSafeHouse(Player p) {
        super(p, "Safe House");
    }

    @Override
    public boolean atLocation() {
        System.out.println("You are at " + this.getName());
        System.out.println("Your hearth is full");
        this.getPlayer().setHealth(this.getPlayer().getOrjHealth());
        return true;
    }
}
