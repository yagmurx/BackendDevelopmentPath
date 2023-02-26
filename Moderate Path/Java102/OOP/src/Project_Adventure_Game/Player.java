package Project_Adventure_Game;

import java.util.Scanner;

public class Player {
    private String name;
    private int money;
    private int health;
    private int damage;
    private String characterName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {

        PlayerCharacter[] charList = {new charSamurai(), new charArcher(), new charKnight()};

        System.out.println("====================================================");
        for(PlayerCharacter pc : charList) {
            System.out.println("Character: "    + pc.getName()
                             + "\tID: "         + pc.getId()
                             + "\tDamage: "     + pc.getDamage()
                             + "\tHealth: "     + pc.getHealth()
                             + "\tMoney: "      + pc.getMoney());
        }
        System.out.print("Please select a character ");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new charSamurai());
                break;
            case 2:
                initPlayer(new charArcher());
                break;
            case 3:
                initPlayer(new charKnight());
                break;
            default:
                initPlayer(new charSamurai());
        }

        System.out.println(this.getName() + ", you are a " + this.getCharacterName());
        System.out.println("====================================================");
    }

    public void initPlayer(PlayerCharacter pc) {
        this.setCharacterName(pc.getName());
        this.setDamage(pc.getDamage());
        this.setHealth(pc.getHealth());
        this.setMoney(pc.getMoney());
    }

    public void printInfo() {
        System.out.println( "Weapon: " + this.getInventory().getWeapon().getName() +
                            "\t Damage: " + this.getDamage() +
                            "\t Health: " + this.getHealth() +
                            "\t Money: " + this.getMoney());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
