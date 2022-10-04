package Classes.Exampels;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}


public class CircleClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        circle1.radius = 7;
        circle2.radius = 10;

        System.out.println("Area: " + circle1.area());
        System.out.println("Perimeter: " + circle1.perimeter());
        System.out.println("Circumference: " + circle1.circumference() + "\n");

        System.out.println("Area: " + circle2.area());
        System.out.println("Perimeter: " + circle2.perimeter());
        System.out.println("Circumference: " + circle2.circumference());
    }
}
