package Classes.Inheritence.Parent;


class Parent {
    public Parent() {
        System.out.println("Parent Constructor without parameter");
    }

    public Parent(int x) {
        System.out.println("Parent Constructor with parameter: " + x);
    }
}

class Child extends Parent{
    public Child() {
        System.out.println("Child Constructor without parameter");
    }

    public Child(int y, int x) {
        super(x);
        System.out.println("Child Constructor with parameter: " + y);
    }
}

class GrandChild extends Child{
    public GrandChild() {
        System.out.println("GrandChild Constructor without parameter");
    }

    public GrandChild(int z, int y) {
        super(y, z);
        System.out.println("GrandChild Constructor with parameter: " + z);
    }
}

public class ParentClass {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        Child child = new Child();
//        GrandChild grandChild1 = new GrandChild();
        GrandChild grandChild2 = new GrandChild(5, 10);

    }
}
