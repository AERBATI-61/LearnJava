package Classes.Abstraction.AbstractRules;
// Rule 1
abstract class Abstracts1{}

// Rule 2
/*abstract class Abstracts2{ abstract public void abstractMethod2();}*/

// Rule 3 // Abstract class and Abstract method can not be final and static
/*abstract final class Abstracts3{ abstract public final void abstractMethod3(); }*/
/*abstract static class Abstracts3{abstract public static void abstractMethod3();}*/

// Rule 4 // for inheritance subClasses must be Abstracts
/*Abstract class Sub1 extends Abstracts1{ }*/

// Rule 5 for inheritance subClasses must be Abstracts Or load Abstract method
/*class Sub2 extends Abstracts1{ public void abstractMethod1() {} }*/


public class AbstractRules {

    // Rule 1
    public static void main(String[] args) { Abstracts1 abstracts;}

    // Rule 2
    /*public static void main(String[] args) { Abstracts2 abstracts2;}*/

    // Rule 3
    /*public static void main(String[] args) { Abstract3 abstract3;}*/

    // Rule 4
    /*public static void main(String[] args) { Sub1 Sub1;}*/

    // Rule 5
    /*public static void main(String[] args) { Sub2 Sub2;}*/
}
