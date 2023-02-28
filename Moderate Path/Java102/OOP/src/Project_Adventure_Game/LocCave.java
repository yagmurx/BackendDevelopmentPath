package Project_Adventure_Game;

public class LocCave extends BattleLocation {
    public LocCave(Player player) {
        super(player, "Cave", new monsZombie(), "food", 3);
    }
}
