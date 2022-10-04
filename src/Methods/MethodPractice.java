package Methods;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;

public class MethodPractice {
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    int min(int x, int y) {
        return x < y ? x : y;
    }

    void callByValue(int i) {
        i++;
        System.out.println(i);
    }

    void callByRefaranceWithArray(int A[], int index, int value) {
        A[index] = value;
    }

    void callByRefaranceWithString(String n){
        n = "Welcome " + n;
    }

    static int reverce(int n){
        int reverceNumber=0;
        while(n!=0){
            reverceNumber = reverceNumber*10 + n%10;
            n = n/10;
        }
        return reverceNumber;
    }



    public static void main(String[] args) {
        int a = 10, b = 20;
        int A[] = {2, 4, 6, 8, 10};
        String name = "Arafat";
        System.out.println("Maximum: " + max(a, b));

        MethodPractice methodPractice = new MethodPractice();
        System.out.println("Minimum: " + methodPractice.min(a, b));


        methodPractice.callByValue(a);
        System.out.println(a);


        methodPractice.callByRefaranceWithArray(A, 2, 60);
        for (int i: A){
            System.out.print(" " +i);
        }
        System.out.println();

        methodPractice.callByRefaranceWithString(name);
        System.out.println(name);
        System.out.println(reverce(123456));





    }
}
