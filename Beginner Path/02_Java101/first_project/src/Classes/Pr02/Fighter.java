package Classes.Pr02;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter (String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int kick(Fighter against) {
        System.out.println(this.name + "=> " + against.name + " " + this.damage + " Damage");
        if(against.isDodge()) {
            System.out.println(against.name + " dodge the damage");
            return against.health;
        }
        if(against.health - this.damage <= 0)
            return 0;
        return against.health - this.damage;
    }

    boolean isDodge() {
        double prob = Math.random()*100;
        return prob <= this.dodge;
    }
}
