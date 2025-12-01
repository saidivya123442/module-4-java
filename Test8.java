class Book {
    String title; int price;
    Book(String title, int price) { this.title = title; this.price = price; }
    public String toString() { return "Book[title=" + title + ", price=" + price + "]"; }
}
class Car {}
class Student {
    int roll;
    Student(int roll) { this.roll = roll; }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return roll == s.roll;
    }
    public int hashCode() { return roll; }
}
class Movie {
    String name; int rating;
    public String toString() { return "Movie[name=" + name + ", rating=" + rating + "]"; }
}
class Player {
    int age;
    Player(int age) { this.age = age; }
    public int hashCode() { return age; }
}
public class Test8 {
    public static void main(String[] args) {
        Book b = new Book("Java", 500); System.out.println(b);
        Car c = new Car(); System.out.println(c.getClass());
        Student s1 = new Student(1), s2 = new Student(1);
        System.out.println(s1.equals(s2));
        Movie m = new Movie(); m.name = "Avatar"; m.rating = 9; System.out.println(m);
        Player p = new Player(22); System.out.println(p.hashCode());
    }
}
