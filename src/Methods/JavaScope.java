package Methods;

public class JavaScope {
    static int a = 5;
    public static void main(String[] args) {
        a = 20;

        int b = 30;
        {
            a = 30;
            b=40;
            int c = 30;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        {
            b=90;
            System.out.println(b);
        }


        a = 6;
        b=400;


        System.out.println(a);
        System.out.println(b);
    }
}
