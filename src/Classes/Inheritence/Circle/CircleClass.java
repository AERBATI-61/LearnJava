package Classes.Inheritence.Circle;

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



class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area()*height;
    }
}


public class CircleClass {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.radius = 7;
        cylinder.height = 10;
        System.out.println("volume: "+cylinder.volume());
        System.out.println("area: "+cylinder.area());
        System.out.println("perimeter: "+cylinder.perimeter());
        System.out.println("circumference: "+cylinder.circumference());

        Circle circle = new Circle();
//        circle.height = 10;
        circle.radius = 10;
        System.out.println("area2: "+circle.area());
        System.out.println("radius: "+circle.radius);
    }
}
