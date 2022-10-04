package Classes.Constructure;

public class CallConstructure {
    public static void main(String[] args) {
        Constuctor constuctor1 = new Constuctor();
        Constuctor constuctor2 = new Constuctor(5);
        Constuctor constuctor3 = new Constuctor("Constructur");

        System.out.println(constuctor1);
        System.out.println(constuctor2);
        System.out.println(constuctor3);



        Insan ali = new Insan();
        Insan veli = new Insan(20,45,190);
        ali.age = 10;
        ali.heaght = 180;
        ali.weight = 70;
        System.out.println(ali.age +", "+ ali.weight + ", " + ali.heaght);
        System.out.println(veli.age +", "+ veli.weight + ", " + veli.heaght);


        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(2);
        Rectangle rectangle2 = new Rectangle(10.0, 20.0);
        Rectangle rectangle3 = new Rectangle(-10.0, -20.0);

        System.out.println("factoriyelMethod: " + rectangle.factoriyelMethod());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getBreadch());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle3.getLength());






    }
}
