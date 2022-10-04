package Classes.Abstraction.Shape;

abstract class Shape {
    abstract public double perimeter();

    abstract public double area();
}


class Circle extends Shape {
    double radius;

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breath;

    public double perimeter() {
        return 2 * (length + breath);
    }

    public double area() {
        return length * breath;
    }
}


public class ShapeClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.breath = 10;
        rectangle.length = 5;
        System.out.println("rectangle.area: " + rectangle.area());
        System.out.println("rectangle.perimeter: " + rectangle.perimeter());
        System.out.println();



        Shape shape = rectangle;
        System.out.println("shape.area: " + shape.area());
        System.out.println("shape.perimeter: " + shape.perimeter());
        System.out.println();




        Shape shape1 = new Rectangle();
//        shape1.length = 10;
//        shape1.breath = 10;
        System.out.println("shape1.area: " + shape1.area());
        System.out.println("shape1.perimeter: " + shape1.perimeter());
        System.out.println();


//        Shape shape1 = new Shape(); using this method in abstract is wrong.
////        shape1.perimeter();
////        shape1.area();


        Circle circle = new Circle();
        circle.radius = 30;
        System.out.println("circle.area: " + circle.area());
        System.out.println("circle.perimeter: " + circle.perimeter());
        System.out.println();



        Shape shape2 = circle;
        System.out.println("shape2.area: " + shape2.area());
        System.out.println("shape2.perimeter: " + shape2.perimeter());

        Shape shape3 = new Circle();
        System.out.println("shape3.area: " + shape3.area());
        System.out.println("shape3.perimeter: " + shape3.perimeter());


    }

}
