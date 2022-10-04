package Methods;

import java.time.LocalTime;

public class PrimeNumber {
    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    static int okek(int a, int b){
        while (a!=b){
            if (a>b) a=a-b;
            else b=b-a;
        }
        return a;


    }



    public static void main(String[] args) {

        System.out.println(isPrime(31));

        System.out.println(okek(35, 42));


        // Find Prime Numbers in 100
        for (int i = 3; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    isPrime = false;
            }
            if (isPrime == true)
                System.out.println("it's prime Number: " + i);
        }


    }


}
