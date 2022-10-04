package Classes.Nasted_Classes.InnerClass.Outer;


class Outer{
    static int x = 10;
    Inner inner = new Inner();
    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x + ", " + y);
        }
    }

    public void outerDisplay(){
        //Inner inner = new Inner();
        inner.innerDisplay();
        System.out.println(inner.y + ", "+ x );
//        System.out.println(inner.x + ", "+ y );
    }
}



public class OuterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();


        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
//        oi.outerDisplay();

    }
}
