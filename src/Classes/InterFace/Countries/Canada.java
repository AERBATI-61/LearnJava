package Classes.InterFace.Countries;

public class Canada implements Countries, Content{
    @Override
    public int phoneAreaCode() {
        return 1;
    }

    @Override
    public void area() {
        System.out.println("Canada is inside North America");
    }

    @Override
    public void hasWater() {
        System.out.println("It has water.");
    }

    public void canadaMethod() {
        System.out.println("this is canada method.");
    }
}


// extends to class (reqular or abstract class)
// implamant interface