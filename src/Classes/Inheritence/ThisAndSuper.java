package Classes.Inheritence;

class This {
    int length, breadth, x = 10;

    This(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

class Super extends This {
    int height, x = 20;

    Super(int l, int b, int h) {
        super(l, b);
        height = h;
    }
    public int kup(){
        return length*breadth*height;
    }

    void display() {
        System.out.println("super.x : " + super.x);
        System.out.println("x: " + x);
    }

}

public class ThisAndSuper {
    public static void main(String[] args) {
        This th = new This(100, 200);
        th.display();

        Super sup = new Super(5,5,5);

        System.out.println(sup.length);
        System.out.println(sup.breadth);
        System.out.println(sup.height);

        System.out.println(sup.kup());
        sup.display();

    }
}
