package Classes.Pr02;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120, 100, 60);
        Fighter f2 = new Fighter("B", 20, 100, 90, 40);

        Match match = new Match(f1, f2, 80,110);
        match.run();
    }
}
