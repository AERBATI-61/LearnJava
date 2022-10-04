package Classes.OverRiding.Tv;

class Tv{
    public void switchOn(){ System.out.println("Tv is Switched On.");}
    public void changeChannel(){ System.out.println("Tv channel is changes.");}
}

class SmartTv extends Tv{
    @Override
    public void switchOn(){ System.out.println("SmartTv is Switched On.");}

    @Override
    public void changeChannel(){ System.out.println("SmartTv channel is changes.");}

    public void browse(){ System.out.println("Smart Tv Browsing.");}



}




public class TvClass {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.switchOn();
        tv.changeChannel();

        SmartTv smartTv = new SmartTv();
        smartTv.switchOn();
        smartTv.browse();

        Tv tv1 = new SmartTv();

        tv1.switchOn();
//        tv1.browse();



    }
}
