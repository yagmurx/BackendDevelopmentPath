package Project_Adventure_Game;

public abstract class SafeLocation extends Location {

    public SafeLocation(Player p, String name) {
        super(p, name);
    }

    @Override
    public boolean atLocation() {
        return true;
    }

}

