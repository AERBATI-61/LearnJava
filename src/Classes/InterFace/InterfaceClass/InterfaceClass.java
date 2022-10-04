package Classes.InterFace.InterfaceClass;


interface Interface{
    void meth1();
    void meth2();
}

class MyInterface implements Interface{
    public void meth1(){
        System.out.println("Meth1 of Class My");
    }

    public void meth2(){
        System.out.println("Meth2 of Class My");
    }

    public void meth3(){
        System.out.println("Meth3 of Class My");
    }

}

public class InterfaceClass {
    public static void main(String[] args) {
        /*Interface i1 = new Interface();
        Interface i2;*/
        Interface i3 = new MyInterface();
        i3.meth1();

        i3.meth2();
//        i3.meth3();

        System.out.println();

        MyInterface i4 = new MyInterface();
        i4.meth1();
        i4.meth2();
        i4.meth3();
    }
}
