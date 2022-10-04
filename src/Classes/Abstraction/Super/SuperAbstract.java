package Classes.Abstraction.Super;

abstract class Super {

    public Super(){System.out.println("Super Construct");}
    public void meth1(){System.out.println("Meth1 of Super");}
    abstract public void meth2();

}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Meth2 of Sub");
    }
}

public class SuperAbstract {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}
