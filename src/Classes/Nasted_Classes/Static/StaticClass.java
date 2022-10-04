package Classes.Nasted_Classes.Static;


class Static {
    static int a = 10;
    int b = 20;

    static class Inner {
        void display() {
            System.out.println(a);
//            System.out.println(b); // b static olmadigi icin ulasamam
        }
    }
}

class Test{
    static int x = 10;
    int y = 10;
    void show(){
        System.out.println("men x: " + x + " " + "men y: "+ y);

    }

    static void showStatic(){ // it is not accessible local variable
        System.out.println(x);// x+y
    }
}


public class StaticClass {
    public static void main(String[] args) {
        /*Static.Inner si = new Static.Inner();
        si.display();*/

        Test test = new Test();
        test.show();
        test.x = 20;
        test.y = 20;
        test.showStatic();

        Test test1 = new Test();
        test1.show();
        test.x = 30;
        test.y = 20;
        test1.showStatic();

        Test test2 = new Test();
        test2.show();
        test2.showStatic();

    }
}
