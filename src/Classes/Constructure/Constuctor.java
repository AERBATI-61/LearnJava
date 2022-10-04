package Classes.Constructure;

class Insan {
    int age;
    int heaght;
    int weight;

    public Insan() {
        System.out.println("1 Insan objesi olusturuldu.");
    }

    public Insan(int age, int heaght, int weight) {
        this();
        this.age = age;
        this.weight = weight;
        this.heaght = heaght;

    }
}

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = breadth = 5.0;
    }

    public Rectangle(double size) {
        length = breadth = size;
    }

    public Rectangle(double l, double b) {
        setLength(l);
        setBreadch(b);
    }

    public int factoriyelMethod(){
        int fact = 1;
        System.out.println("length: "+length);
        for(int i=1; i<=length; i++){
            fact *= i;
        }
        return fact;
    }



    public double getLength(){
        return length;
    }

    public double getBreadch(){
        return breadth;
    }


    public void setLength(double l){
        if (l>=0)
            length = l;
        else
            length = 0;
    }

    public void setBreadch(double b) {
        if (b>=0)
            length = b;
        else
            length = 0;

    }


}


public class Constuctor {
    int a;
    String b;

    public Constuctor() {
        System.out.println("1 Constuctor olusturuldu.");
    }

    public Constuctor(int a) {
        this.a = a;
        System.out.println(a);
    }


    public Constuctor(String a) {
        this.b = a;
        System.out.println(b);
    }

    public void dummyMethod(String a, int b) {

    }


}
