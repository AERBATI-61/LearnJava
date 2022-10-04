package Classes.OverRiding.Animals;

public class Dog extends Animals{
    public void makeSound(){
        System.out.println("Dog making sound");
    }

    public void check(){
        walking();
        makeSound();

    }




}
