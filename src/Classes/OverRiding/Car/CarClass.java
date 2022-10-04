package Classes.OverRiding.Car;

class Car{
    public void carStart(){System.out.println("Car Started.");}
    public void carAccelerate(){System.out.println("Car Accelerated.");}
    public void carGearChange(){System.out.println("Car Gear Changed.");}
}

class LuxaryCar extends Car{
    public void changeGear(){System.out.println("Automatic Gear.");}
    public void openRoof(){System.out.println("Sun roof is opened.");}
}


public class CarClass {
    public static void main(String[] args) {
        Car car = new Car();
        LuxaryCar luxaryCar = new LuxaryCar();

        car.carStart();
        car.carAccelerate();
        car.carGearChange();

        luxaryCar.carStart();
        luxaryCar.carAccelerate();
        luxaryCar.carGearChange();

        luxaryCar.changeGear();
        luxaryCar.openRoof();


        Car car1 = new LuxaryCar();
        car1.carStart();
        car1.carAccelerate();
        car1.carGearChange();
//        car1.openRoof();


    }
}
