package Classes.Nasted_Classes.Localinner;
// bir islemin icinde var edinip o islemin suresince yasayip ve sonrasinda yok olan classlar.


abstract class My{
    abstract public void showInfo();
}

interface MyInterface{
    public void showMe();
}


class LocalInfo {
    public void display() {

        My my = new My() {
            @Override
            public void showInfo() {
                System.out.print("World ");
            }
        };
        my.showInfo();

         new My(){
             public void showInfo(){
                 System.out.println("Kiss Me");
             }
         }.showInfo();


        MyInterface myInterface = new MyInterface() {
            public void showMe() {
                System.out.println("new MyInterface");
            }
        };
        myInterface.showMe();

        new MyInterface(){
            public void showMe(){
                System.out.println("Directly MyInterface ");
            }
        }.showMe();
    }
}


class Local{
    public void display(){
        class Inner{
            public void show(){
                System.out.print("Hello ");
            }
        }

        /*Inner inner = new Inner();
        inner.show();*/

        new Inner().show();
    }
}






public class LocalClass {
    public static void main(String[] args) {
        Local local = new Local();
        local.display();

        LocalInfo localInfo = new LocalInfo();
        localInfo.display();
    }

}
