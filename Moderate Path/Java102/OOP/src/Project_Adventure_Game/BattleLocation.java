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

        }
        else {
            System.out.println("Coward!");
        }
        return true;
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
