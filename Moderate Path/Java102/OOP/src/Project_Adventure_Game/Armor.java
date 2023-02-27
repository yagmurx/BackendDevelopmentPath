package Project_Adventure_Game;

public class Armor {
    private String name;
    private int id;
    private int defence;
    private int price;

    public Armor(String name, int id, int defence, int price) {
        this.id = id;
        this.name = name;
        this.defence = defence;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = {new Armor("Basic", 1, 1, 15),
                new Armor("Mid  ", 2, 3, 25),
                new Armor("Advance", 3, 5, 40)};
        return armorList;
    }

    public static Armor getArmorByID(int id) {
        for(Armor a: Armor.armors()) {
            if(a.getId() == id)
                return a;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
