package Project_Adventure_Game;

public class Inventory {
    private Weapon weapon;
    private boolean water;
    private boolean food;
    private boolean firewood;
    private String armorName;
    private int armorDefense;

    public Inventory() {
        this.weapon = new Weapon("Fist", 0,0,0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
