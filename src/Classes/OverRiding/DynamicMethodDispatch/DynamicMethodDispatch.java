package Classes.OverRiding.DynamicMethodDispatch;

// Run time polymorphism using method overriding
// Method will be call depending on object.


class ParentSuper{

    void meth1(){
        System.out.println("Super Meth1.");
    }
    void meth2(){
        System.out.println("Super Meth2.");
    }


}

class ChildSuper extends ParentSuper{

    @Override
    void meth2(){
        System.out.println("ChildSuper Meth2.");
    }
    void meth3(){
        System.out.println("ChildSuper Meth3.");
    }

}


class GrandChildSuper extends ParentSuper{


    void meth2(int a){
        System.out.println("GrandChildSuper Meth2.");
    }


}



public class DynamicMethodDispatch {
    public static void main(String[] args) {
        ParentSuper parentSuper = new ParentSuper();
        parentSuper.meth1();
        parentSuper.meth2();
        System.out.println();


        ChildSuper childSuper = new ChildSuper();
        childSuper.meth1();
        childSuper.meth2();
        childSuper.meth3();
        System.out.println();

        ParentSuper parentSuper1 = new ChildSuper();  // parentSuper1-> reference.  ChildSuper()-> Object
        parentSuper1.meth1();
        parentSuper1.meth2();
//        parentSuper1.meth3(); // can not calling
        System.out.println();

//        ChildSuper childSuper1 = new ParentSuper();  // can not using


        ParentSuper parentSuper2 = new GrandChildSuper();
        parentSuper2.meth1();
        parentSuper2.meth2();




    }
}
