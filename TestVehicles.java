class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}

class Bike extends Vehicle {
    String type;

    Bike(String brand, int speed, String type) {
        super(brand, speed);
        this.type = type;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}

public class TestVehicles {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 180, 5);
        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println();

        Bike bike = new Bike("Yamaha", 120, "Sport");
        System.out.println("Bike Details:");
        bike.displayInfo();
    }
}
