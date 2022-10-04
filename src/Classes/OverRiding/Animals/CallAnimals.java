package Classes.OverRiding.Animals;

public class CallAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.walking();

        System.out.println("\n");

        Animals animals = new Animals();
        animals.makeSound();
        animals.walking();
//        animals.check();

        System.out.println("\n");
        dog.check();

    }
}
