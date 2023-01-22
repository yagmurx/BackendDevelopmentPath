package Classes;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi A3", "sedan", "green", 100,  210);
        audi.printInfo();

        Car bmw = new Car("BMW E30 M3", "sport", "blue", 75,  220);
        bmw.printInfo();

        Car mercedes = new Car("Mercedes CLA180", "sport", "white", 90,  180);
        mercedes.printInfo();

    }
}
