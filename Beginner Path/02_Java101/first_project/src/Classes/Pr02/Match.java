package Classes.Pr02;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run () {
        if(isCheck()) {
            System.out.println("Match Start");
            while(this.f1.health > 0 && this.f2.health > 0) {
                this.f2.health = this.f1.kick(this.f2);
                if(isWin())
                    break;
                this.f1.health = this.f2.kick(this.f1);
                if(isWin())
                    break;
            }
        } else {
            System.out.println("Fighters could not match");
        }
    }

    boolean isCheck () {
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin () {
        if(this.f1.health == 0) {
            System.out.println(this.f2.name + " win the fight");
            return true;
        }
        else if(this.f2.health == 0) {
            System.out.println(this.f1.name + " win the fight");
            return true;
        }
        else
            return false;
    }
}
