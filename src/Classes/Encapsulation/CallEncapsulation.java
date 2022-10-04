package Classes.Encapsulation;

public class CallEncapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setAge(27);
        int age = encapsulation.getAge();
        System.out.println("My age is: "+ age);

//        encapsulation.color = "Black";
//        encapsulation.model = "BMW";
//        encapsulation.engine = 12.5;
//        encapsulation.doors = 4;


        encapsulation.setinfo("Black", "BMW", 2.4, 4);
        int info = encapsulation.getinfo();
        System.out.println("My Car's doors are: "+ info);
        encapsulation.showInfo();

    }
}
