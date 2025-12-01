public class Dynamic {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
