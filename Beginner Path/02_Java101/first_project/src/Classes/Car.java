package Classes;

class Car {
    String model;
    String type = "sport";
    String color;
    int speed;
    int speedLimit = 180;

    Car(String model, String type, String color, int speed, int speedLimit) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.speedLimit = speedLimit;
    }

    void increaseSpeed(int increment) {
        if(this.speed+increment < this.speedLimit)
            this.speed += increment;
    }

    void decreaseSpeed(int decrease) {
        if(this.speed > 0)
            this.speed -= decrease;
    }

    void printSpeed() {
        System.out.println("Speed: " + this.speed);
    }

    void printInfo() {
        System.out.println("Model\t: " + this.model);
        System.out.println("Type\t: " + this.type);
        System.out.println("Color\t: " + this.color);
        System.out.println("Speed\t: " + this.speed);
        System.out.println("Speed Limit\t: " + this.speedLimit);
    }
}
