package Classes.Exampels;

class DataHiding{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        if (l>=0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b){
        if (b>=0)
            breadth = b;
        else
            breadth = 0;

    }

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        return length == breadth;
    }


}


public class DataHidingClass {
    public static void main(String[] args) {

        DataHiding dataHiding = new DataHiding();
        dataHiding.setLength(20);
        dataHiding.setBreadth(10);


        System.out.println("Area: "+ dataHiding.area());
        System.out.println("Perimeter: "+dataHiding.perimeter());
        System.out.println("isSquare: "+dataHiding.isSquare());

        System.out.println(dataHiding.getLength());
        System.out.println(dataHiding.getBreadth());


    }
}
