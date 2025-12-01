class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(5, 8);

        c.displayShape();
        c.area();

        r.displayShape();
        r.area();
    }
}
