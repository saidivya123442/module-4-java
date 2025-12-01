class Transport {
    void deliver() { System.out.println("General delivery"); }
}
class Truck extends Transport {
    void deliver() { System.out.println("Truck delivery"); }
}
class Ship extends Transport {
    void deliver() { System.out.println("Ship delivery"); }
}
class Airplane extends Transport {
    void deliver() { System.out.println("Airplane delivery"); }
}
public class TestTransport {
    public static void main(String[] args) {
        Transport t = new Truck(); t.deliver();
        t = new Ship(); t.deliver();
        t = new Airplane(); t.deliver();
    }
}
