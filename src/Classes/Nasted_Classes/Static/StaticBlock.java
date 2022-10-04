package Classes.Nasted_Classes.Static;



class StaticTest{
    static int s;
    static {
        System.out.println("Block1");
        s = 10;

    }

    static {
        System.out.println("Block2");
        s = 20;
    }
}


public class StaticBlock {
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();

        System.out.println("Main");

    }
}
