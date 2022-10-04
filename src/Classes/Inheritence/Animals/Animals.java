package Classes.Inheritence.Animals;

public class Animals {
    String color;
    int age;
    String sound;

    public void makeSound(){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        PersionCat persionCat = new PersionCat();



        System.out.println(cat.fur);
        System.out.println(cat.makingSound());

        System.out.println(chicken.wing);
        System.out.println(chicken.makeAnotherSound());


        System.out.println(persionCat.wolking());
        System.out.println(persionCat.makingSound());
//        System.out.println(persionCat.makeAnotherSound());

    }


}
