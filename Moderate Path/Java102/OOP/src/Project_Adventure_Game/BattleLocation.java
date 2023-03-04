package Project_Adventure_Game;
import java.util.Locale;
import java.util.Random;

public abstract class BattleLocation extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLocation (Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }
    @Override
    public boolean atLocation() {
        int monsNum = randomMonster();
        System.out.println("You are at " + this.getName());
        System.out.println("Warning! " + monsNum + " " + this.getMonster().getName() + " lives there.");

        System.out.println("(B) for Battle and (R) for Run! Select your way: ");
        String selectBattle = input.nextLine();
        selectBattle = selectBattle.toUpperCase();

        if(selectBattle.equals("B")) {
            System.out.println("Brave-heart!");
            if(combat(monsNum)) {
                System.out.println("You defeat all monsters!");
                System.out.println("You won the " + this.getAward());
                this.getPlayer().getInventory().winAward(this.getAward());
                return true;
            }
        }
        if(this.getPlayer().getHealth() < 0) {
            System.out.println("You are dead");
            return false;
        }
        return true;
    }

    public boolean combat(int monsNum) {
        playerStats();
        monsterStats();
        for(int i=1; i<=monsNum; i++) {
            System.out.println("\n" + i + ". " + this.getMonster().getName());
            this.getMonster().setHealth(this.getMonster().getOrjHealth());
            while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.print("(B) for Battle and (R) for Run! Select your way: ");
                String selectBattle = input.nextLine();
                selectBattle = selectBattle.toUpperCase();

                if(selectBattle.equals("B")) {
                    monster.setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                    if(this.getMonster().getHealth() > 0){
                        int obsDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getDefence();
                        if(obsDamage < 0)
                            obsDamage = 0;
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                    }

                    System.out.println(this.getMonster().getName() + " health is " + this.getMonster().getHealth());
                    System.out.println(this.getPlayer().getName() + " health is " + this.getPlayer().getHealth());

                } else
                    return false; // REJECT BATTLE
            } // FIGHT

            if(this.getPlayer().getHealth() <=0) // DEATH
                return false;

            else if(this.getMonster().getHealth() <=0) // A MONSTER DEATH
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());

        } // MONSTERS DEFEAT
        return true; // WON THE FIGHT
    }

    public void playerStats() {
        System.out.println("\nPlayer Stats");
        System.out.println("Health: " + this.getPlayer().getHealth() +
                "\tDamage:" + this.getPlayer().getTotalDamage() +
                "\tWeapon:" + this.getPlayer().getInventory().getWeapon().getName() +
                "\tDefence:" + this.getPlayer().getInventory().getArmor().getDefence() +
                "\tArmor:" + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("==========================");
    }
    public void monsterStats() {
        System.out.println(this.getMonster().getName() + " Stats");
        System.out.println( "health: " + this.getMonster().getHealth() +
                            "\tDamage: " + this.getMonster().getDamage() +
                            "\tAward: " + this.getMonster().getAward());
        System.out.println("==========================");
    }

    public int randomMonster() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
