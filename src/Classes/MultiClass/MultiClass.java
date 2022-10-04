package Classes.MultiClass;

public class MultiClass {
    public static void main(String[] args) {
        firstMethod();
    }

    public static void firstMethod(){
        SecondClass secondClass = new SecondClass();
        System.out.println(secondClass.name);

    }
}


class SecondClass{
    String name = "Arafat";
}