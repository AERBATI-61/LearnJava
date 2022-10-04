package Classes.InterFace.Rules;


interface Rule1{ // you can use abstract with public in interface. you can not use private with abstract in interface
    public abstract void meth1();
    //private abstract void meth2();
}

interface Rule2{
    int x = 10;
    final static int y = 20;
}

interface Rule3{
    public static void meth3(){
        System.out.println("meth3");
    }
}

interface Rule extends Rule3{ // interface can extend another interface
    void meth4();
}

interface Rule4{
    private void meth5(){
        System.out.println("Method5");
    }
    default void meth6(){
        meth5();
    }
}


class MyRule implements Rule{
    public void meth4(){}
    public void meth3(){}

}

public class RulesClass {
    public static void main(String[] args) {
        System.out.println(Rule2.x);
        System.out.println(Rule2.y);
        Rule3.meth3();
        //Rule4.meth6(); it's private

    }
}
