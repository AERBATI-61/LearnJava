package Methods;

class Maximum{
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    static float max(float a, float b) {
        return a > b ? a : b;
    }
}

public class MethodOverLoading {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    static float max(float a, float b) {
        return a > b ? a : b;
    }





    public static void main(String[] args) {
        System.out.println(max(10, 15));
        System.out.println(max(10, 15, 20));
        System.out.println(max(10f, 15f));


        Maximum m = new Maximum();
        System.out.println(m.max(10, 15));
        System.out.println(m.max(10, 15, 20));
        System.out.println(m.max(10f, 15f));
    }
}
