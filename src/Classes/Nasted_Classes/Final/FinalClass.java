package Classes.Nasted_Classes.Final;




class Test{
    public final void show(){
        System.out.println("Final Test 1");
    }
}


//not use
/*class T extends Test{
    public void show(){
        System.out.println("Final Test1");
    }
}*/




public class FinalClass {

    final float PI;
    {
        PI = 10;
    }

    static final float MAX;
    static
    {
        MAX = 10;
    }

    public static void main(String[] args) {
    final float PI = 10f;
    System.out.println(PI);

    Test test = new Test();
    test.show();
    }
}
