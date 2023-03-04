package Project_Adventure_Game;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean water;
    private boolean food;
    private boolean firewood;

    public Inventory() {
        this.weapon = new Weapon("Fist", -1,0,0);
        this.armor = new Armor("Scrap", -1, 0,0);
    }
    public void winAward(String award) {
        switch(award){
            case "food":
                this.setFood(true);
                break;
            case "water":
                this.setWater(true);
                break;
            case "firewood":
                this.setFirewood(true);
                break;
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }


    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
}
