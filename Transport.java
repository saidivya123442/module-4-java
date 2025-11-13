public class Transport {
    void move() {
        System.out.println("Transport is moving...");
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();

        System.out.println("--- Bus ---");
        bus.move();
        bus.carryPassengers();

        System.out.println("\n--- Truck ---");
        truck.move();
        truck.carryGoods();
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }
}
