interface Bank { int rateOfInterest(); }
class SBI implements Bank {
    public int rateOfInterest() { return 6; }
}
class HDFC implements Bank {
    public int rateOfInterest() { return 8; }
}
public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new SBI(); Bank b2 = new HDFC();
        System.out.println(b1.rateOfInterest());
        System.out.println(b2.rateOfInterest());
    }
}
