package Classes.Exampels;

class Cylinder {
    public int radius, height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return lidArea() * height;
    }


}


public class CylinderClass {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.height = 10;
        cylinder.radius = 10;

        System.out.println(cylinder.lidArea());
        System.out.println(cylinder.totalSurfaceArea());
        System.out.println(cylinder.circumference());
        System.out.println(cylinder.volume());

    }
}
