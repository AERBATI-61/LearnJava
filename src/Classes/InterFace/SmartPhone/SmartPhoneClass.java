package Classes.InterFace.SmartPhone;

class Phone{
    public void call(){System.out.println("Phone Call.");}
    public void sms(){System.out.println("Phone sending SMS.");}
}

interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    void stop();
}


class SmartPhone extends Phone implements Camera, MusicPlayer{
    public void videoCall(){System.out.println("Smart Phone video Calling.");}
    public void click(){System.out.println("Smart Phone clicking Photo.");}
    public void record(){System.out.println("Smart Phone recording video.");}
    public void play(){System.out.println("Smart Phone playing music.");}
    public void stop(){System.out.println("Smart Phone stopped playing music.");}
}

public class SmartPhoneClass {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.videoCall();
        smartPhone.click();
        smartPhone.record();
        smartPhone.play();
        smartPhone.stop();


        /*
        SmartPhone smartPhone1 = new Phone();
        SmartPhone smartPhone1 = new Camera();
        SmartPhone smartPhone1 = new MusicPlayer();
        */



        Camera camera = new SmartPhone();
        camera.click();
        camera.record();
        /*camera.videoCall;
        camera.play();
        camera.stop();*/


        MusicPlayer musicPlayer = new SmartPhone();
        musicPlayer.play();
        musicPlayer.stop();
        /*musicPlayer.videoCall();
        musicPlayer.click();
        musicPlayer.record();*/


        Phone phone = new SmartPhone();
        phone.call();
        phone.sms();
        /*phone.play();
        phone.stop();
        phone.videoCall();
        phone.click();
        phone.record();*/





        /*Camera camera1 = new MusicPlayer();
        MusicPlayer musicPlayer1 = new Camera();
        Phone phone1 = new Camera();
        Camera camera2 = new  Phone();
        Phone phone2 = new MusicPlayer();
        MusicPlayer musicPlayer2 = new Phone();*/



    }


}
