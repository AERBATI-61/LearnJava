package Methods;


public class VariableArgument {
    static void show(int... A) {
        for (int a : A) {
            System.out.println(a);
        }
    }

    static void showString(int start, String... A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(i + 1 + ". " + A[i]);
        }
        System.out.println(start);
    }


    static int maximum(int ...B) {
        if (B.length == 0) return Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] > max) {
                max = B[i];
            }

        }return max;
    }

    public static void main(String[] args) {
        show();
        show(1, 2, 3);
        show(new int[]{20, 30});

        System.out.println("MAXIMUM NUMBER IS: "+maximum(1, 2, 3));

        showString(10, "Arafat", "Emin");
        showString(5, "Arafat", "Emin", "Rahile");

        System.out.println("MAXIMUM NUMBER IS: "+maximum(1, 2, 3));
        System.out.println("MAXIMUM NUMBER IS: "+maximum(10, 2, 3));

    }

}
