package Classes.OverRiding.OverRidingClass;


class OverRiding{
    public void display(){
        System.out.println("SuperClass is Working.");
    }
}

class Overed extends OverRiding{
    @Override
    public void display(){
        System.out.println("Overed Class is Working.");
    }
}







public class OverRidingClass {
    public static void main(String[] args) {

        OverRiding overRiding = new OverRiding();
        overRiding.display();

        System.out.println();

        Overed overed = new Overed();
        overed.display();

        System.out.println();


        OverRiding overedRiding = new Overed();
        overedRiding.display();
    }
}
