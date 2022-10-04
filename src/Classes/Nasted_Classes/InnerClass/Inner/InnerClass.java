package Classes.Nasted_Classes.InnerClass.Inner;

// Class alaninda adi olan, yapisal olarak bir butunun parcasi olan, varligina o butune borclu olan classlar. ben varsam o da var

// Inner class can access the members of outer class directly.
// Outer class can not access the member of Inner class directly. unless it has created an object

public class InnerClass {

    String name = "Arafat";

    public void call() {
        InsideClass insideClass = new InsideClass();
        insideClass.innerMethod();

    }

    public class InsideClass {
        String name = "Emin";

        public void innerMethod() {
            System.out.println("I am inside of inner class");
        }

        public int secondinnerMethod() {
            return 100;
        }
    }
}
