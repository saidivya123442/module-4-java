class Doctor {
    void consultationFee() {
        System.out.println("General doctor consultation fee: ₹500");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹800");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹1200");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon consultation fee: ₹1500");
    }

    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        Doctor d2 = new Dentist();
        Doctor d3 = new Cardiologist();
        Doctor d4 = new Surgeon();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
        d4.consultationFee();
    }
}
