package Collection.Try;

public class TryCathClass {
    public static void main(String[] args) {
//        int number = Integer.parseInt("5f");
//        System.out.println(number);
        try {
            int number1 = Integer.parseInt("5f");
            System.out.println(number1);
            System.out.println("inside Try");
        } catch (NumberFormatException BulunanHata) {
            System.out.println("BulunanHata: " + BulunanHata);
            System.out.println("inside Catch");
        }


        System.out.println(checkNumber("5l"));
        System.out.println(arithmeticException(50));

        String[] colors = {"Arafat", "Rahile", "Meryem"};
        System.out.println(indexOut(colors));


        System.out.println("Start: ");
        Integer san = -5;
        if (san < 0) {
            throw new ArithmeticException("bu san sifiran kucuk olamaz: ");
        }
        System.out.println("Finish.");


    }

    public static boolean checkNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception BulunanHata) {
            return false;
        }
    }

    public static int arithmeticException(Integer input) {
        try {
            int data = input / 0;

            return data;
        } catch (ArithmeticException BulunanHata) {
            System.out.println("Anigiznig zamanida bir san 0 ge bulnemtu:  " + BulunanHata);
            return input;
        } finally {
            System.out.println("inside Finally.");
        }
    }


    public static String indexOut(String[] colors) {
        try {
            System.out.println(colors[5]);
            System.out.println("inside Try.");
        } catch (IndexOutOfBoundsException BulunanHata) {
            System.out.println("inside Catch.");
            //System.out.println(colors[5]);
            System.out.println("BulunanHata: " + BulunanHata);
        }
        return colors[2];
    }


}
