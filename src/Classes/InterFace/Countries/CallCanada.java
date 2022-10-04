package Classes.InterFace.Countries;

public class CallCanada {
    public static void main(String[] args) {

        Canada canada = new Canada();
        canada.hasWater();
        canada.area();
        canada.canadaMethod();
        System.out.println(canada.phoneAreaCode());



        Countries countries = new Canada();
        countries.phoneAreaCode();
        System.out.println(countries.phoneAreaCode());
        /*countries.hasWater();
        countries.area();
        countries.canadaMethod();*/

        Content content = new Canada();
        content.area();
        content.hasWater(); // becouse extenden planet in content
        /*content.canadaMethod();
        content.phoneAreaCode();*/


        Planet planet = new Canada();
        planet.hasWater();
        /*planet.area();
        planet.canadaMethod();
        planet.phoneAreaCode();*/

    }
}
