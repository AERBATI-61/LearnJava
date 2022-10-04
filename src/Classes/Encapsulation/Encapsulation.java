package Classes.Encapsulation;

// class atribuit'larini private yapmak ve baska ozelliklerini olabildigi kadar gizlemek
public class Encapsulation {
    private int age;
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }



    private String color;
    private String model;
    private double engine;
    private int doors;




    public void setinfo(String color, String model, double engine, int doors) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        if (doors < 2 || doors > 4)
            this.doors = 8;
        else
            this.doors = doors;
    }

    public int getinfo() {
        return this.doors;
    }

    public void showInfo(){
        System.out.println(this.color + ", "+ this.model + ", "+ this.engine + ", "+ this.doors);
    }


}
