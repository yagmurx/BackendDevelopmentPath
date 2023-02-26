package Project_Adventure_Game;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = {new Weapon("Gun   ", 1, 2, 10),
                            new Weapon("Sword", 2, 3, 20),
                            new Weapon("Rifle", 3, 7, 30)};
        return weaponList;
    }

    public static Weapon getWeaponByID(int id) {
        for(Weapon w: Weapon.weapons()) {
            if(w.getId() == id)
                return w;
        }
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
