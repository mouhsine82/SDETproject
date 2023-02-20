package JavaProject2_18;

public interface Shape {
    /*
    1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
     */
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape {
    private double radius;
    private double pi;
    public Circle(double radius, double pi) {
        this.radius = radius;
        this.pi=pi;
    }

    public double calculateArea() {
        return radius*pi*pi;
    }

    public double calculatePerimeter() {
        return 2 * (pi * radius);
    }
}


class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Test the code
class TestShapes {
    public static void main(String[] args) {

        Circle circle = new Circle(5,3.14);
        Square square = new Square(10);

        // Test the calculateArea method
        System.out.println("Area of circle is "+circle.calculateArea());
        System.out.println("Area of square is "+square.calculateArea());

        // Test the calculatePerimeter method
        System.out.println("Perimeter of circle is "+circle.calculatePerimeter());
        System.out.println("Perimeter of square is "+square.calculatePerimeter());
    }
}
