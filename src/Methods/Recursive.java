package Methods;

import java.awt.*;

public class Recursive {
    static void recursive1(int A) {
        if (A > 0) {
//            recursive(A - 1);
            System.out.println(A);
            recursive1(A - 1);
        }
    }

    static void recursive2(int a){
        System.out.println(a + ". Numara");
        if(a>0)
            recursive2(a-1);
    }

    static int recursive3(int a){
        if(a>0) return a + recursive3(a - 1);
        else return 0;
    }



    public static void main(String[] args) {
        recursive1(3);
        recursive2(5);
        System.out.println(recursive3(10));
    }
}
