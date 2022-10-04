package Classes.Abstraction.Abstraction;

public class CallAbstraction {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction() {
            @Override
            public void makeSound() {
                System.out.println("Abstraction method is working.");
            }
        };
        abstraction.makeSound();
        abstraction.eating();

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.makeSound();
        cat1.makeSound();

        Abstraction dog2 = new Dog();
        Abstraction cat2 = new Cat();
        dog2.makeSound();
        cat2.makeSound();


        /*
        dog1 = cat1;
        dog2 = cat2;
        */

    }
}
