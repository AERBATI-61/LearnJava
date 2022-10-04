package Classes.Exampels;

import java.util.Random;

class Rectangle {
    public int length;
    public int breadth;

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        return length == breadth;
    }

}


public class RectangleClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.length = 10;
        rectangle.breadth = 10;

        System.out.println("Area: "+ rectangle.area());
        System.out.println("Perimeter: "+rectangle.perimeter());
        System.out.println("isSquare: "+rectangle.isSquare());
    }
}
