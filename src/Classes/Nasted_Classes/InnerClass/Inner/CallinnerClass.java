package Classes.Nasted_Classes.InnerClass.Inner;

public class CallinnerClass {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();

        InnerClass.InsideClass insideClass = innerClass.new InsideClass();
        insideClass.innerMethod();
        int number = insideClass.secondinnerMethod();

        innerClass.call();
        System.out.println();
        System.out.println(innerClass.name + " " + insideClass.name + " " + number);



    }
}
