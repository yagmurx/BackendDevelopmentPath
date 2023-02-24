package Modifiers;

public class player {
    public String name;
    public int id;
    public static String game = "Last of Us";
    public static int count = 0;

    public player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void login() {
        count++;
    }
}
